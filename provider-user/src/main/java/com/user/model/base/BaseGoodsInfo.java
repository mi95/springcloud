package com.user.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseGoodsInfo<M extends BaseGoodsInfo<M>> extends Model<M> implements IBean {

    public M setId(java.lang.Long id) {
        set("id", id);
        return (M) this;
    }

    public java.lang.Long getId() {
        return getLong("id");
    }

    public M setName(java.lang.Long name) {
        set("name", name);
        return (M) this;
    }

    public java.lang.Long getName() {
        return getLong("name");
    }

}