package com.user.utils;

import com.common.utils.CommonException;
import com.user.annotation.Errors;

public class UsersException extends CommonException {
    private static final long serialVersionUID = 5124466783350227901L;

    public UsersException() {
        super();
    }

    public UsersException(String message) {
        this.setMsg(message);
    }

    /*---------------------------------------------用户管理异常 2000-2999----------------------------------------------*/
    @Errors(code = 2000, chDesc = "账号已注册")
    public static final int ERROR_USER_EXIST = 2000;
    @Errors(code = 2001, chDesc = "无效账号")
    public static final int ERROR_INVALID_ACCOUNT = 2001;
    /*---------------------------------------------用户管理异常----------------------------------------------*/
}