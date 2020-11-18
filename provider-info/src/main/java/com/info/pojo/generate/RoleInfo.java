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
    * 角色信息
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo implements Serializable {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 名称
    */
    private String name;

    /**
    * 描述
    */
    private String comment;

    /**
    * 状态 1-可用 2-禁用
    */
    private Byte state;

    private static final long serialVersionUID = 1L;
}