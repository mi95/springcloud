package com.user.controller;

import com.common.controller.BaseController;
import com.common.pojo.RespBean;
import com.common.utils.CommonException;
import com.jfinal.kit.StrKit;
import com.user.annotation.LoginToken;
import com.user.model.UserInfo;
import com.user.service.MsgService;
import com.user.service.UserService;
import com.user.utils.TokenUtil;
import com.user.utils.UserUtil;
import com.user.utils.UsersException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @Autowired
    MsgService msgService;

    @PostMapping("/user")
    public RespBean addUser(@RequestBody UserInfo userInfo) {
        userService.addUser(userInfo);
        return RespBean.success();
    }

    @PatchMapping("/user")
    public RespBean editUser(UserInfo userInfo) {
        userService.editUser(userInfo);
        return RespBean.success();
    }

    @DeleteMapping("/user")
    public RespBean delUser(Long userId) {
        userService.delUser(userId);
        return RespBean.success();
    }

    @GetMapping("/user")
    public RespBean findUser(UserInfo user) {
        return RespBean.success(userService.findUser(user));
    }

    @GetMapping("/userPage")
    public RespBean findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo) {
        return RespBean.success(userService.findUserPageList(pageNum, pageSize, userInfo));
    }

    @PostMapping("/msg")
    public RespBean addMsg(String msg) {
        String port = msgService.addMsg(1, msg);
        return RespBean.success(port);
    }

    @PostMapping("login")
    public RespBean login(UserInfo user) {
        user.setUserName("a");
        user.setPwd("a");
        UserInfo info = userService.findUser(user);
        if (info == null || StrKit.isBlank(user.getPwd()) || !info.getPwd().equals(user.getPwd())) {
            throw new CommonException(CommonException.ERROR_USERNAME_OR_PWD);
        } else if (info.getState() == UserUtil.STATE_DISABLE) {
            throw new CommonException(UsersException.ERROR_INVALID_ACCOUNT);
        }

        Map map = new HashMap();
        String token = TokenUtil.getToken(info);
        map.put("token", token);
        map.put("user", info);
        return RespBean.success(map);
    }

    @LoginToken
    @GetMapping("getMessage")
    public String getMessage() {
        return "你已通过验证";
    }
}