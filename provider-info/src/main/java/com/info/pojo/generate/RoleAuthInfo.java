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
    * 角色权限关联
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleAuthInfo implements Serializable {
    /**
    * 角色编号
    */
    private Integer roleId;

    /**
    * 权限编号
    */
    private Integer authId;

    private static final long serialVersionUID = 1L;
}