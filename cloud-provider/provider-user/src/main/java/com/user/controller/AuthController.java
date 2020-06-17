package com.user.controller;

import com.alibaba.fastjson.JSONArray;
import com.common.controller.BaseController;
import com.common.utils.CommonValues;
import com.common.pojo.RespBean;
import com.jfinal.plugin.activerecord.Record;
import com.user.model.RoleInfo;
import com.user.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController extends BaseController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    AuthService authService;

    @PostMapping("/addRole")
    RespBean addRole(RoleInfo roleInfo) {
        authService.addRole(roleInfo);
        return RespBean.success();
    }

    @PostMapping("/editRole")
    RespBean editRole(RoleInfo roleInfo) {
        authService.editRole(roleInfo);
        return RespBean.success();
    }

    @PostMapping("/updRoleState")
    RespBean updRoleState(Integer id, Integer beforeState) {
        Integer state = beforeState == CommonValues.STATE_ABLE ? CommonValues.STATE_DISABLE : CommonValues.STATE_ABLE;
        authService.updRoleState(id, state, beforeState);
        return RespBean.success();
    }

    @GetMapping("/findRolePageList")
    RespBean findRolePageList(Integer pageNum, Integer pageSize, String key, Integer id, Integer state) {
        return RespBean.success(authService.findRolePageList(pageNum, pageSize, key, id, state));
    }

    @GetMapping("/findRoleById")
    RespBean findRoleById(Integer roleId) {
        return RespBean.success(authService.findRoleById(roleId));
    }

    @PostMapping("/addRoleUser")
    RespBean addRoleUser(Integer roleId, String userIds) {
        authService.addRoleUser(roleId, userIds);
        return RespBean.success();
    }

    @PostMapping("/delRoleUser")
    RespBean delRoleUser(Integer roleId, Integer userId) {
        authService.delRoleUser(roleId, userId);
        return RespBean.success();
    }

    @GetMapping("/findUserPageListByRoleId")
    RespBean findUserPageListByRoleId(Integer pageNum, Integer pageSize, Integer roleId) {
        return RespBean.success(authService.findUserPageListByRoleId(pageNum, pageSize, roleId));
    }

    @GetMapping("/findUserPageListByRoleIdForNotExist")
    RespBean findUserPageListByRoleIdForNotExist(Integer pageNum, Integer pageSize, Integer roleId) {
        return RespBean.success(authService.findUserPageByRoleIdForNotExist(pageNum, pageSize, roleId));
    }

    @PostMapping("/addRoleAuth")
    RespBean addRoleAuth(Integer roleId, String authIds) {
        authService.addRoleAuth(roleId, authIds);
        return RespBean.success();
    }

//	@PostMapping("/delRoleAuth")
//	RespBody delRoleAuth(RoleAuthInfo roleAuthInfo) {
//		verifyTypeObject(roleAuthInfo);
//		authService.delRoleAuth(roleAuthInfo);
//		return RespBody.success();
//	}

    @GetMapping("/findAuthListByRoleId")
    RespBean findAuthListByRoleId(Integer roleId) {
        List<Record> list = authService.findAuthListByRoleId(roleId);
        List<Record> menuList = new ArrayList<>();
        StringBuffer checked = new StringBuffer();
        RespBean RespBody = new RespBean();
        for (int i = 0; i < list.size(); i++) {
            Record record = list.get(i);
            if (record.get("children") != null) {
                record.set("children", JSONArray.parseArray(record.get("children").toString()));
            }
            if (record.get("checked") != null && record.get("checked") != "") {
                checked.append(record.get("checked").toString()).append(",");
            }
            menuList.add(record);
        }
        Map map = new HashMap();
        map.put("menus", menuList);
        map.put("checked", checked.toString().split(","));
        return RespBody.success(map);
    }

    @GetMapping("/findAuthList")
    RespBean findAuthList(Integer type, Integer fatherId, Integer userId) {
        return RespBean.success(authService.findAuthList(type, fatherId, userId));
    }
}