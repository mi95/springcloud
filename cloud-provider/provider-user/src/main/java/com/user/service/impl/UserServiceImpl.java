package com.user.service.impl;

import com.common.utils.CommonException;
import com.common.utils.CommonUtils;
import com.common.utils.ParamVerifyUtil;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.user.model.RoleInfo;
import com.user.model.UserInfo;
import com.user.service.UserService;
import com.user.utils.SqlParaUtil;
import com.user.utils.UserDetialUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Transactional
    @Override
    public void addUser(UserInfo userInfo) {
        ParamVerifyUtil.verifyT(userInfo);
        CommonException.operResultBoolean(userInfo.save());
    }

    @Override
    public void editUser(UserInfo userInfo) {
        ParamVerifyUtil.verifyT(userInfo, userInfo.getId());
        CommonException.operResultBoolean(userInfo.update());
    }

    @Override
    public void delUser(Long userId) {
        ParamVerifyUtil.verifyT(userId);
        CommonException.operResultBoolean(UserInfo.dao.deleteById(userId));
    }

    @Override
    public UserInfo findUser(UserInfo user) {
        ParamVerifyUtil.verifyT(user);
        SqlParaUtil sqlParaUtil = new SqlParaUtil();
        sqlParaUtil.addSql("select * from user_info where 1=1");
        if (user.getId() != null && user.getId() > 0) {
            sqlParaUtil.addSql(" and id = ?").addPara(user.getId());
        }
        if (StrKit.notBlank(user.getUserName())) {
            sqlParaUtil.addSql(" and account = ?").addPara(user.getUserName());
        }
        if (user.getState() != null && user.getState() > 0) {
            sqlParaUtil.addSql(" and state = ?").addPara(user.getState());
        }
        return UserInfo.dao.findFirst(sqlParaUtil);
    }

    @Override
    public Page<Record> findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo) {
        SqlParaUtil sqlPara = new SqlParaUtil();
        sqlPara.addSql("select * from user_info where 1=1");
        if (ParamVerifyUtil.verifyLong(userInfo.getId())) {
            sqlPara.addSql(" and id = ?").addPara(userInfo.getId());
        }
        if (StrKit.notBlank(userInfo.getUserName())) {
            sqlPara.addSql(" and account like ?").addPara(CommonUtils.getLikeStr(userInfo.getUserName()));
        }
        if (ParamVerifyUtil.verifyInteger(userInfo.getState())) {
            sqlPara.addSql(" and state = ?").addPara(userInfo.getState());
        }
        return Db.paginate(pageNum, pageSize, sqlPara);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetialUtils userDetialUtils;
        UserInfo userInfo = UserInfo.dao.findFirst("select * from user_info where user_name = ?", s);
        if (userInfo != null) {
            userDetialUtils = (UserDetialUtils) userInfo;
            List<RoleInfo> roleInfos = RoleInfo.dao.find("select * from role_info a " +
                    "LEFT JOIN role_user_info b on a.id = b.role_id " +
                    "where b.user_id = ?");
            userDetialUtils.setRoleInfos(roleInfos);
            return userDetialUtils;
        } else {
            CommonException.throwNewCommonExceptionForCustom("用户不存在！");
        }
        return null;
    }
}