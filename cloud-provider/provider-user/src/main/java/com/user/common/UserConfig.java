package com.user.common;

public class UserConfig{
	//可用状态
	public static final int STATE_ABLE = 1;//可用
	public static final int STATE_DISABLE = 2;//禁用
	
	//配置属性
	public static final String CONFIG_KEY_ERROR = "error.category"; //异常配置key
	public static final String CONFIG_KEY_SESSION_TIMEOUT= "session.timeout";//会话超时配置
	public static final String CONFIG_ERROR_VALUE_EN = "en";//异常提示-英文
	public static final String CONFIG_ERROR_VALUE_CH = "ch";//异常提示-中文
	
	//主外键冲突异常编码
	public static final int PK_UK_ERROR_CODE = 1062;
	
	//缓存键
	public static final String COOKIE_KEY_ID = "userId";
}