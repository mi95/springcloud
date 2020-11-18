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
public class RoleUserInfo implements Serializable {
    /**
    * 角色编号
    */
    private Integer roleId;

    /**
    * 用户编号
    */
    private Integer userId;

    private static final long serialVersionUID = 1L;
}