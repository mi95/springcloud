package com.info.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
/**
    * 账号信息表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfos implements Serializable {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 账号
    */
    private String username;

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