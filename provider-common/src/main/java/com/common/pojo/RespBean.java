package com.common.pojo;

public class RespBean {
    Integer code;
    Object data;
    String msg;

    public RespBean() {
    }

    public RespBean(Integer code) {
        this.code = code;
    }

    public RespBean(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RespBean(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static RespBean success() {
        return new RespBean(200);
    }

    public static RespBean fail(String msg) {
        return new RespBean(500, msg);
    }

    public static <T> RespBean success(T data) {

        return new RespBean(200, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}