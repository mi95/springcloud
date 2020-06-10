package com.common.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 可用状态 1-可用 2-禁用
     */
    private Byte state;

    private static final long serialVersionUID = 1L;
}

