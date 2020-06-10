package com.app.service;

import com.app.model.UserInfo;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

public interface UserService {
    public void addUser(UserInfo userInfo);

    public void editUser(UserInfo userInfo);

    public void delUser(Long userId);

    public Record findUserById(Long userId);

    public Page<Record> findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo);
}