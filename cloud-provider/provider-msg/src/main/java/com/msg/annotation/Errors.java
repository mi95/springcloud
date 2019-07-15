package com.msg.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface Errors{
	/**
	 * 编码
	 * @return
	 */
	int code();
	
	/**
	 * 中文描述
	 * @return
	 */
	String chDesc() default "";
	
	/**
	 * 英文描述
	 * @return
	 */
	String enDesc() default "";
}
