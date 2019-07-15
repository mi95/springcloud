package com.user.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface AuthUrl {
	
	/**
	 * 权限编号
	 * @return
	 */
	String id() default "";

	/**
	 * 父id
	 */
	String fatherId() default "";

	/**
	 * 权限url
	 * 
	 * @return
	 */
	String url() default "";
	
	/**
	 * 权限类型
	 */
	int type();
	
	/**
	 * 权限说名
	 */
	String desc() default "";

}
