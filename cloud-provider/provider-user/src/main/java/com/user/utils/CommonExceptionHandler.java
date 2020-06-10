package com.user.utils;

import com.common.annotation.Errors;
import com.common.utils.CommonException;
import com.common.utils.CommonValues;
import com.common.utils.ParamVerifyUtil;
import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * 全局异常捕获处理
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @Autowired
    private Environment env;

    //主外键冲突异常编码
    public static final int PK_UK_ERROR_CODE = 1062;

    /**
     * 系统异常处理
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ModelMap defaultErrorHandler(HttpServletRequest req, Exception e) {
        ModelMap map = new ModelMap();
        map.put("code", CommonException.SYS_DEAL_FAIL);
        map.put("msg", getErrorsMsg(CommonException.SYS_DEAL_FAIL));
        map.put("url", req.getRequestURL().toString());
        map.put("result", 0);
        if (e.getCause() instanceof MySQLQueryInterruptedException) {
            MySQLQueryInterruptedException e2 = (MySQLQueryInterruptedException) e.getCause();
            if (e2.getErrorCode() == PK_UK_ERROR_CODE) {
                map.put("code", CommonException.ERROR_DATA_EXIST);
                map.put("msg", getErrorsMsg(CommonException.ERROR_DATA_EXIST));
            }
        }
        return map;
    }

    /**
     * 自定义异常处理
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public ModelMap jsonErrorHandler(HttpServletRequest req, CommonException e) {
        ModelMap map = new ModelMap();
        map.put("result", 0);
        map.put("url", req.getRequestURL().toString());
        map.put("msg", e.getErrorCode() == CommonException.SYS_CUSTOM ? e.getMsg() : getErrorsMsg(e.getErrorCode()));
        map.put("code", e.getErrorCode());
        return map;
    }

    /**
     * 自定义异常获取描述
     *
     * @param code
     * @return
     * @throws CommonException
     */
    private String getErrorsMsg(Integer code) throws CommonException {
        if (ParamVerifyUtil.verifyInteger(code)) {
            throw new CommonException(CommonException.SYS_DEAL_FAIL);
        }
        //获取指定类所有属性上的注解
        Field[] fields = CommonException.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Errors.class)) {
                Errors annotation = field.getAnnotation(Errors.class);
                if (annotation != null && annotation.code() == code) {
                    if (env != null && !StringUtils.isEmpty(env.getProperty(CommonValues.CONFIG_KEY_ERROR)) && env.getProperty(CommonValues.CONFIG_KEY_ERROR).equals(CommonValues.CONFIG_ERROR_VALUE_EN)) {
                        return annotation.enDesc();
                    }
                    return annotation.chDesc();
                }
            }
        }
        throw new CommonException(CommonException.SYS_DEAL_FAIL);
    }
}