package com.user.service;

import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.user.model.AuthInfo;
import com.user.model.RoleInfo;
import com.user.model.UserInfo;

import java.util.List;

public interface AuthService {
    /**
     * 添加角色
     * @param roleInfo
     */
    void addRole(RoleInfo roleInfo);

    /**
     * 编辑角色
     * @param roleInfo
     */
    void editRole(RoleInfo roleInfo);

    /**
     * 修改角色状态
     */
    void updRoleState(Integer id,Integer state,Integer beforeState);

    Page<RoleInfo> findRolePageList(Integer pageNum, Integer pageSize, String key, Integer id, Integer state);

    RoleInfo findRoleById(Integer roleId);

    void addRoleUser(Integer roleId,String userIds);

    void delRoleUser(Integer roleId,Integer userId);

    /**
     * 根据url获取需要的角色
     * @param path
     * @return
     */
    List<RoleInfo> findRoleByPath(String path);

    Page<UserInfo> findUserPageListByRoleId(Integer pageNum, Integer pageSize, Integer roleId);

    /**
     * 查询没有该角色的用户
     * @param pageNum
     * @param pageSize
     * @param roleId
     * @return
     */
    Page<UserInfo> findUserPageByRoleIdForNotExist(Integer pageNum,Integer pageSize,Integer roleId);

    void addRoleAuth(Integer roleId,String authIds);

//	void delRoleAuth(RoleAuthInfo roleAuthInfo);

    List<Record> findAuthListByRoleId(Integer roleId);

    /**
     * 获取权限资源
     * @param type 1-父菜单 2-子菜单 3-按钮
     * @param fatherId 0-父菜单
     * @param userId 用户编号
     * @return
     */
    List<AuthInfo> findAuthList(Integer type, Integer fatherId, Integer userId);

}
