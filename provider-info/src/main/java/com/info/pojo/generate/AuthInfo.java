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
 * 权限菜单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父编号
     */
    private Integer fatherId;

    /**
     * 路径
     */
    private String path;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 权限类型 1-父菜单 2-子菜单 3-按钮
     */
    private Byte type;

    /**
     * 状态 1-可用 2-禁用
     */
    private Byte state;

    private static final long serialVersionUID = 1L;
}