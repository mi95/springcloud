package com.user.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRoleUserInfo<M extends BaseRoleUserInfo<M>> extends Model<M> implements IBean {

	public M setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
		return (M)this;
	}
	
	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}

	public M setUserId(java.lang.Long userId) {
		set("user_id", userId);
		return (M)this;
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

}
