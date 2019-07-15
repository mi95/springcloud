package com.user.common;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.user.annotation.Errors;

/**
 * 全局异常捕获处理
 *
 */
@ControllerAdvice
public class CommonExceptionHandler{
	@Autowired
	private Environment env; 
	/**
	 * 系统异常处理
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
    public ModelMap defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		e.printStackTrace();
		ModelMap map = new ModelMap();
		map.put("code",CommonException.SYS_DEAL_FAIL);
		map.put("msg", getErrorsMsg(CommonException.SYS_DEAL_FAIL));
		map.put("url", req.getRequestURL().toString());
		map.put("result",0);
		if(e.getCause() instanceof MySQLIntegrityConstraintViolationException){
			MySQLIntegrityConstraintViolationException e2 = (MySQLIntegrityConstraintViolationException) e.getCause();
			if(e2.getErrorCode() == UserConfig.PK_UK_ERROR_CODE){
				map.put("code",CommonException.ERROR_DATA_EXIST);
				map.put("msg", getErrorsMsg(CommonException.ERROR_DATA_EXIST));
			}
		}
		return map;
    }
	
	/**
	 * 自定义异常处理
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public ModelMap jsonErrorHandler(HttpServletRequest req, CommonException e) throws Exception {
		e.printStackTrace();
		ModelMap map = new ModelMap();
		map.put("result",0);
		map.put("url",req.getRequestURL().toString());
        map.put("msg",getErrorsMsg(e.getErrorCode()));
        map.put("code",e.getErrorCode());
        return map;
    }
	
	/**
	 * 自定义异常获取描述
	 * @param code
	 * @return
	 * @throws CommonException
	 */
	private String getErrorsMsg(Integer code) throws CommonException {
		if(code == null || code < 1000){
			throw new CommonException(CommonException.SYS_DEAL_FAIL);
		}
		//获取指定类所有属性上的注解
		Field[] fields = CommonException.class.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Errors.class)) {
				Errors annotation = (Errors) field.getAnnotation(Errors.class);
				if (annotation != null && annotation.code() == code) {
					if(env != null && !StringUtils.isEmpty(env.getProperty(UserConfig.CONFIG_KEY_ERROR)) && env.getProperty(UserConfig.CONFIG_KEY_ERROR).equals(UserConfig.CONFIG_ERROR_VALUE_EN)){
						return annotation.enDesc();
					}
					return annotation.chDesc();
				}
			}
		}
		throw new CommonException(CommonException.SYS_DEAL_FAIL);
	}
}