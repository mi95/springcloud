package com.user.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRoleInfo<M extends BaseRoleInfo<M>> extends Model<M> implements IBean {

    public M setId(java.lang.Long id) {
        set("id", id);
        return (M) this;
    }

    public java.lang.Long getId() {
        return getLong("id");
    }

    public M setName(java.lang.String name) {
        set("name", name);
        return (M) this;
    }

    public java.lang.String getName() {
        return getStr("name");
    }

    public M setComment(java.lang.String comment) {
        set("comment", comment);
        return (M) this;
    }

    public java.lang.String getComment() {
        return getStr("comment");
    }

    public M setState(java.lang.Integer state) {
        set("state", state);
        return (M) this;
    }

    public java.lang.Integer getState() {
        return getInt("state");
    }

}
