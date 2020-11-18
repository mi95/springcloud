package com.user.service;

import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.user.model.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
//	UserInfo login(UserInfo userInfo);

    void addUser(UserInfo userInfo);

    void editUser(UserInfo userInfo);

    void delUser(Long userId);

    UserInfo findUser(UserInfo user);

    Page<Record> findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo);
}