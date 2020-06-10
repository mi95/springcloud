package com.app.controller;

import com.app.model.UserInfo;
import com.app.service.MsgService;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @Autowired
    MsgService msgService;

    @Value("${server.port}")
    String port;

    @GetMapping("/test")
    public String test() {
        return "this is:" + port;
    }

    @PostMapping("/user")
    public ModelMap addUser(UserInfo userInfo) {
        userService.addUser(userInfo);
        return renderSuccess();
    }

    @PatchMapping("/user")
    public ModelMap editUser(UserInfo userInfo) {
        userService.editUser(userInfo);
        return renderSuccess();
    }

    @DeleteMapping("/user")
    public ModelMap delUser(Long userId) {
        userService.delUser(userId);
        return renderSuccess();
    }

    @GetMapping("/user")
    public ModelMap findUserById(Long userId) {
        return returnObject(userService.findUserById(userId));
    }

    @GetMapping("/userPage")
    public ModelMap findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo) {
        return returnObject(userService.findUserPageList(pageNum, pageSize, userInfo));
    }

    @PostMapping("/msg")
    public ModelMap addMsg(String msg) {
        String port = msgService.addMsg(1, msg);
        return returnObject(port);
    }
}