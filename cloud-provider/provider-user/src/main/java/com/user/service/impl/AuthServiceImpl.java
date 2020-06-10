package com.user.service.impl;

import com.common.utils.CommonException;
import com.common.utils.ParamVerifyUtil;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.user.model.AuthInfo;
import com.user.model.RoleInfo;
import com.user.model.UserInfo;
import com.user.service.AuthService;
import com.user.utils.SqlParaUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AuthService")
public class AuthServiceImpl implements AuthService {

	@Override
	public void addRole(RoleInfo roleInfo) {
		ParamVerifyUtil.verifyT(roleInfo,roleInfo.getName());
		CommonException.operResultBoolean(roleInfo.save());
	}

	@Override
	public void editRole(RoleInfo roleInfo) {
		ParamVerifyUtil.verifyT(roleInfo,roleInfo.getId(),roleInfo.getName());
		CommonException.operResultBoolean(roleInfo.update());
	}

	@Override
	public void updRoleState(Integer id,Integer state,Integer beforeState) {
		ParamVerifyUtil.verifyT(id,state,beforeState);
		SqlParaUtil sqlParaUtil = new SqlParaUtil();
		sqlParaUtil.addSql("update role_info set state = ? where id = ? and state = ?")
			.addPara(state).addPara(id).addPara(beforeState);
		CommonException.operResultInteger(Db.update(sqlParaUtil));
	}

	@Override
	public Page<RoleInfo> findRolePageList(Integer pageNum, Integer pageSize, String key, Integer id, Integer state) {
		ParamVerifyUtil.verifyT(key,id,state);
		if(pageNum == null || pageNum < 1){
			pageNum = 1;
		}
		if(pageSize == null || pageSize < 1){
			pageSize = 10;
		}
		SqlParaUtil paraUtil = new SqlParaUtil();
		paraUtil.addSql("select * from role_info where 1=1");
		paraUtil.andColsLikeTo(key,"name","comment");
		paraUtil.andColEqualsTo(id,"id");
		paraUtil.andColEqualsTo(state,"state");
        return RoleInfo.dao.paginate(pageNum,pageSize,paraUtil);
	}

	@Override
	public RoleInfo findRoleById(Integer roleId) {
		ParamVerifyUtil.verifyInteger(roleId);
        return RoleInfo.dao.findById(roleId);
	}

	@Override
	public List<RoleInfo> findRoleByPath(String path){
		ParamVerifyUtil.verifyT(path);
		return RoleInfo.dao.find("select * from role_info a\n" +
				"\tjoin role_auth_info b on a.id = b.role_id\n" +
				"\tjoin auth_info c on b.auth_id = c.id\n" +
				"\twhere c.path = ?",path);
	}

	@Override
	public void addRoleUser(Integer roleId,String userIds) {
		ParamVerifyUtil.verifyT(roleId,userIds);
		String[] users = userIds.split(",");
		if(users != null && users.length > 0) {
			Db.delete("delete from role_user_info where role_id = ?",roleId);
			SqlParaUtil sqlParaUtil = new SqlParaUtil("insert into role_user_info values ");
			for(String userId : users){
				if(ParamVerifyUtil.verifyTBoolean(userId)){
					sqlParaUtil.addSqlAndParam("(?,?),",roleId,userId).deleteCharAt(1);
				}
			}
			CommonException.operResultInteger(Db.update(sqlParaUtil));
		}
	}

	@Override
	public void delRoleUser(Integer roleId,Integer userId) {
		Db.delete("delete from role_user_info where role_id = ? and user_id = ?",roleId,userId);
	}

	@Override
	public Page<UserInfo> findUserPageListByRoleId(Integer pageNum, Integer pageSize, Integer roleId) {
		return UserInfo.dao.paginate(pageNum,pageSize,new SqlParaUtil(
					"select * from user_info " +
						"where not EXISTS (select 1 from role_user_info roleUser " +
							"where role_id = ? user_info.id = roleUser.user_id)",roleId));
	}

	@Override
	public Page<UserInfo> findUserPageByRoleIdForNotExist(Integer pageNum, Integer pageSize, Integer roleId) {
        return UserInfo.dao.paginate(pageNum,pageSize,
				new SqlParaUtil(
						"select * " +
						"from user_info " +
						"where not EXISTS (select 1 from role_user_info roleUser " +
								"where user_info.id = roleUser.user_id)"));
    }

	@Override
	public void addRoleAuth(Integer roleId,String authIds) {
		ParamVerifyUtil.verifyT(roleId,authIds);
		String[] auths = authIds.split(",");
		if(auths != null && auths.length > 0) {
			Db.delete("delete from role_auth_info where role_id = ?",roleId);
			SqlParaUtil sqlParaUtil = new SqlParaUtil("insert into role_auth_info values ");
			for(String authId : auths){
				if(ParamVerifyUtil.verifyTBoolean(authId)){
					sqlParaUtil.addSqlAndParam("(?,?),",roleId,authId).deleteCharAt(1);
				}
			}
			CommonException.operResultInteger(Db.update(sqlParaUtil));
		}
	}

//	@Override
//	public void delRoleAuth(Integer roleId,String authIds) {
//		if(authMapper.delRoleAuth(roleAuthInfo) < 1) {
//			throw new CommonException(CommonException.ERROR_OPER_FAIL);
//		}
//	}

	@Override
	public List<Record> findAuthListByRoleId(Integer roleId) {
        return Db.find("select a.* from auth_info a" +
				"JOIN role_auth_info b on a.id = b.auth_id" +
				"where b.role_id = ?",roleId);
	}

	@Override
	public List<AuthInfo> findAuthList(Integer type, Integer fatherId, Integer userId) {
		SqlParaUtil sqlParaUtil = new SqlParaUtil();
		sqlParaUtil.addSql("select * from auth_info where 1=1");
		sqlParaUtil.andColEqualsTo(type,"type")
				.andColEqualsTo(fatherId,"father_id")
				.andColEqualsTo(userId,"user_id");
        return AuthInfo.dao.find(sqlParaUtil);
	}
}
