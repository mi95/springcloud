package com.shop.utils;

import com.common.annotation.Errors;
import com.common.pojo.RespBean;
import com.common.utils.CommonException;
import com.common.utils.CommonValues;
import com.common.utils.ParamVerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.sql.SQLIntegrityConstraintViolationException;

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
    public RespBean defaultErrorHandler(HttpServletRequest req, Exception e) {
        e.printStackTrace();
        RespBean body = new RespBean();
        body.setCode(CommonException.SYS_DEAL_FAIL);
        body.setMsg(getErrorsMsg(CommonException.SYS_DEAL_FAIL));
        if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
            SQLIntegrityConstraintViolationException e2 = (SQLIntegrityConstraintViolationException) e.getCause();
            if (e2.getErrorCode() == PK_UK_ERROR_CODE) {
                body.setCode(CommonException.ERROR_DATA_EXIST);
                body.setMsg(getErrorsMsg(CommonException.ERROR_DATA_EXIST));
            }
        }
        return body;
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
    public RespBean jsonErrorHandler(HttpServletRequest req, CommonException e) {
        RespBean body = new RespBean();
        body.setMsg(e.getErrorCode() == CommonException.SYS_CUSTOM ? e.getMsg() : getErrorsMsg(e.getErrorCode()));
        body.setCode(e.getErrorCode());
        return body;
    }

    /**
     * 自定义异常获取描述
     *
     * @param code
     * @return
     * @throws CommonException
     */
    private String getErrorsMsg(Integer code) throws CommonException {
        if (!ParamVerifyUtil.verifyInteger(code)) {
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