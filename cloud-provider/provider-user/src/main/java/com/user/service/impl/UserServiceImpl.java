package com.user.service.impl;

import org.springframework.stereotype.Service;

import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.user.common.CommonUtils;
import com.user.common.ParamVerifyUtil;
import com.user.common.ServiceErrorUtil;
import com.user.common.SqlParaUtil;
import com.user.model.UserInfo;
import com.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Override
	public void addUser(UserInfo userInfo) {
		ServiceErrorUtil.errObj(userInfo);
		ServiceErrorUtil.operErrBoolean(userInfo.save());
	}

	@Override
	public void editUser(UserInfo userInfo) {
		ServiceErrorUtil.errObj(userInfo);
		ServiceErrorUtil.errLong(userInfo.getId());
		ServiceErrorUtil.operErrBoolean(userInfo.update());
	}

	@Override
	public void delUser(Long userId) {
		ServiceErrorUtil.errLong(userId);
		ServiceErrorUtil.operErrBoolean(UserInfo.dao.deleteById(userId));
	}

	@Override
	public Record findUserById(Long userId) {
		ServiceErrorUtil.errLong(userId);
		return Db.findFirst("select * from user_info where id = ?",userId);
	}

	@Override
	public Page<Record> findUserPageList(Integer pageNum, Integer pageSize, UserInfo userInfo) {
		SqlParaUtil sqlPara = new SqlParaUtil();
		sqlPara.addSql("select * from user_info where 1=1");
		if(ParamVerifyUtil.verifyLong(userInfo.getId())){
			sqlPara.addSql(" and id = ?").addPara(userInfo.getId());
		}
		if(StrKit.notBlank(userInfo.getAccount())) {
			sqlPara.addSql(" and account like ?").addPara(CommonUtils.getLikeStr(userInfo.getAccount()));
		}
		if(ParamVerifyUtil.verifyInteger(userInfo.getState())) {
			sqlPara.addSql(" and state = ?").addPara(userInfo.getState());
		}
		return Db.paginate(pageNum, pageSize, sqlPara);
	}
}