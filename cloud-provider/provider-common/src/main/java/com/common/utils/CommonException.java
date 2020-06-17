package com.common.utils;

import com.common.annotation.Errors;

public class CommonException extends RuntimeException {
    private static final long serialVersionUID = 5124466783350227901L;

    private int errorCode;

    private String msg;

    public CommonException() {
    }

    public CommonException(Integer code, String msg) {
        this.errorCode = code;
        this.msg = msg;
    }

    public CommonException(int code) {
        this.setErrorCode(code);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 抛出自定义异常
     *
     * @param errorCode
     */
    public static void throwNewCommonException(Integer errorCode) {
        if (ParamVerifyUtil.verifyInteger(errorCode)) {
            errorCode = SYS_PARAM_INVALID;
        }
        throw new CommonException(errorCode);
    }

    /**
     * 抛出自定义异常
     *
     * @param msg 错误消息
     */
    public static void throwNewCommonExceptionForCustom(String msg) {
        if (ParamVerifyUtil.verifyTBoolean(msg)) {
            Integer errorCode = SYS_PARAM_INVALID;
            throw new CommonException(errorCode);
        }
        throw new CommonException(SYS_CUSTOM, msg);
    }

    /**
     * 操作失败，抛出异常
     *
     * @param value true-成功
     */
    public static void operResultBoolean(boolean value) {
        ParamVerifyUtil.verifyT(value);
        if (!value) {
            throw new CommonException(ERROR_OPER_FAIL);
        }
    }

    /**
     * 操作失败，抛出异常
     *
     * @param value 1-成功
     */
    public static void operResultInteger(Integer value) {
        ParamVerifyUtil.verifyT(value);
        if (value < 1) {
            throw new CommonException(ERROR_OPER_FAIL);
        }
    }

    @Errors(code = 500)
    public static final int SYS_CUSTOM = 500;
    /*-------------------------------------------通用异常 1000-1999-------------------------------------------------*/
    @Errors(code = 1000, chDesc = "系统处理异常")
    public static final int SYS_DEAL_FAIL = 1000;
    @Errors(code = 1001, chDesc = "数据已存在，请勿重复添加")
    public static final int ERROR_DATA_EXIST = 1001;
    @Errors(code = 1002, chDesc = "参数异常")
    public static final int SYS_PARAM_INVALID = 1002;
    @Errors(code = 1004, chDesc = "权限不够")
    public static final int LIMITED_AUTHORITY = 1004;
    @Errors(code = 1005, chDesc = "无效账户")
    public static final int ACCOUNT_LAPSED = 1005;
    @Errors(code = 1006, chDesc = "该账户在其它地方已经登录，请确认你的账户安全")
    public static final int OTHER_PLACES_LOGIN = 1006;
    @Errors(code = 1007, chDesc = "长时间没有操作，请重新登录")
    public static final int LONG_TIME_NO_OPER = 1007;
    @Errors(code = 1008, chDesc = "请先登录")
    public static final int NO_LOGIN = 1008;
    @Errors(code = 1009, chDesc = "系统处理超时")
    public static final int SYS_TIMEOUT = 1009;
    @Errors(code = 1010, chDesc = "文件不能为空")
    public static final int ERROR_FILE_IS_NULL = 1010;
    @Errors(code = 1011, chDesc = "账号或密码错误")
    public static final int ERROR_USERNAME_OR_PWD = 1011;
    @Errors(code = 1012, chDesc = "验证码不正确")
    public static final int ERROR_VERIFY_CODE = 1012;
    @Errors(code = 1014, chDesc = "操作失败")
    public static final int ERROR_OPER_FAIL = 1014;
    @Errors(code = 1017, chDesc = "无效的玩家编号")
    public static final int ERROR_USER_ID = 1017;
    /*---------------------------------------------用户管理异常 2000-2999----------------------------------------------*/
    @Errors(code = 2000, chDesc = "账号已注册")
    public static final int ERROR_USER_EXIST = 2000;
    @Errors(code = 2001, chDesc = "手机号码格式错误")
    public static final int ERROR_TELL = 2001;
    /*---------------------------------------------通用异常----------------------------------------------*/

}