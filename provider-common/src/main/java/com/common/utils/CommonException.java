package com.common.utils;

import java.util.List;

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

    public CommonException(String msg) {
        this.setMsg(msg);
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
     * 抛出异常，触发事务回滚
     * @param text 错误提示
     */
    public static void throwNewCommonException(String text){
        throw new CommonException(text);
    }

    /**
     * 校验参数
     * @param params
     */
    public static void verifyObjects(Object... params){
        for(Object param: params){
            if(param == null || param.equals("")){
                CommonException.throwNewCommonException("参数异常！");
            }
        }
    }
    public static boolean verifyObjectsB(Object... params){
        for(Object param: params){
            if(param == null || param.equals("")){
                return false;
            }
        }
        return true;
    }
    public static void verifyInteger(Integer... params){
        for(Integer param: params){
            if(param == null || param < 0){
                CommonException.throwNewCommonException("参数异常！");
            }
        }
    }
    public static boolean verifyIntegerB(Integer... params){
        for(Integer param: params){
            if(param == null || param < 0){
                return false;
            }
        }
        return true;
    }
    public static <T> void verifyList(List<T> list){
        if(list == null || list.size() < 1){
            CommonException.throwNewCommonException("参数异常！");
        }
    }
    public static <T> boolean verifyListB(List<T> list){
        return list == null || list.size() < 1;
    }

    /**
     * 抛出自定义异常
     *
     * @param msg 错误消息
     */
    public static void throwNewCommonExceptionForCustom(String msg) {
        throw new CommonException(msg);
    }

    /**
     * 操作失败，抛出异常
     *
     * @param value true-成功
     */
    public static void opeResult(boolean value) {
        CommonException.verifyObjects(value);
        if (!value) {
            throw new CommonException("操作失败");
        }
    }
    public static void opeResult(Integer value) {
        CommonException.verifyObjects(value);
        if (value < 1) {
            throw new CommonException("操作失败");
        }
    }
}