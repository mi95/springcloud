package com.app.common;

import com.app.annotation.Errors;

public class CommonException extends RuntimeException {
    /*-------------------------------------------通用异常 1000-1999-------------------------------------------------*/
    @Errors(code = 1000, chDesc = "参数异常", enDesc = "SYS_PARAM_INVALID")
    public static final int SYS_PARAM_INVALID = 1000;
    @Errors(code = 1001, chDesc = "数据解析格式错误", enDesc = "SYS_PASER_FORMAT_ERROR")
    public static final int SYS_PASER_FORMAT_ERROR = 1001;
    @Errors(code = 1002, chDesc = "上传文件失败", enDesc = "SYS_UPLOAD_FILE_FAIL")
    public static final int SYS_UPLOAD_FILE_FAIL = 1002;
    @Errors(code = 1003, chDesc = "系统处理异常", enDesc = "SYS_DEAL_FAIL")
    public static final int SYS_DEAL_FAIL = 1003;
    @Errors(code = 1004, chDesc = "权限不够", enDesc = "LIMITED_AUTHORITY")
    public static final int LIMITED_AUTHORITY = 1004;
    @Errors(code = 1005, chDesc = "无效账户", enDesc = "ACCOUNT_LAPSED")
    public static final int ACCOUNT_LAPSED = 1005;
    @Errors(code = 1006, chDesc = "该账户在其它地方已经登录，请确认你的账户安全", enDesc = "OTHER_PLACES_LOGIN")
    public static final int OTHER_PLACES_LOGIN = 1006;
    @Errors(code = 1007, chDesc = "长时间没有操作，请重新登录", enDesc = "LONG_TIME_NO_OPER")
    public static final int LONG_TIME_NO_OPER = 1007;
    @Errors(code = 1008, chDesc = "请先登录", enDesc = "NO_LOGIN")
    public static final int NO_LOGIN = 1008;
    @Errors(code = 1009, chDesc = "系统处理超时", enDesc = "SYS_TIMEOUT")
    public static final int SYS_TIMEOUT = 1009;
    @Errors(code = 1010, chDesc = "文件不能为空", enDesc = "ERROR_FILE_IS_NULL")
    public static final int ERROR_FILE_IS_NULL = 1010;
    @Errors(code = 1011, chDesc = "账号或密码错误", enDesc = "ERROR_USERNAME_OR_PWD")
    public static final int ERROR_USERNAME_OR_PWD = 1011;
    @Errors(code = 1012, chDesc = "验证码不正确", enDesc = "ERROR_VRIFY_CODE")
    public static final int ERROR_VERIFY_CODE = 1012;
    @Errors(code = 1014, chDesc = "操作失败", enDesc = "ERROR_OPER_FAIL")
    public static final int ERROR_OPER_FAIL = 1014;
    @Errors(code = 1016, chDesc = "关键字段重复", enDesc = "ERROR_DATA_EXIST")
    public static final int ERROR_DATA_EXIST = 1016;
    @Errors(code = 1017, chDesc = "无效的玩家编号", enDesc = "ERROR_USER_ID")
    public static final int ERROR_USER_ID = 1017;
    /*---------------------------------------------用户管理异常 2000-2999----------------------------------------------*/
    @Errors(code = 2000, chDesc = "账号已注册", enDesc = "ERROR_USER_EXIST")
    public static final int ERROR_USER_EXIST = 2000;
    @Errors(code = 2001, chDesc = "手机号码格式错误", enDesc = "ERROR_TELL")
    public static final int ERROR_TELL = 2001;
    private static final long serialVersionUID = 5124466783350227901L;
    private int errorCode;
    public CommonException(String message) {
        super(message);
    }
    public CommonException(int code) {
        this.errorCode = code;
    }
    /*---------------------------------------------通用异常----------------------------------------------*/

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    /*---------------------------------------------用户管理异常----------------------------------------------*/
}