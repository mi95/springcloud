package com.search.service;


import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.search.pojo.UserInfosBo;

import java.util.List;

public interface SearchService {
    RespBean findById(Integer id);

    RespBean findAllUser(ReqParam param);

    RespBean findAllUserDiff(ReqParam param);

    RespBean addUserAll();

    RespBean addUser(UserInfosBo userInfosBo);

    RespBean addAllUser(List<UserInfosBo> UserInfosBoBos);

    RespBean delUser(UserInfosBo userInfosBo);

    RespBean delAllUser(List<Integer> ids);

    RespBean delIndex(ReqParam param);
}
