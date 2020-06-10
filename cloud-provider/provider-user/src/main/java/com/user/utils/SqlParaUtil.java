package com.user.utils;

import com.common.utils.ParamVerifyUtil;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.SqlPara;

import java.util.ArrayList;
import java.util.List;

public class SqlParaUtil extends SqlPara {
    private static final long serialVersionUID = 8458822473666095496L;
    private StringBuffer sql;
    private List<Object> paraList;

    void ininSql(){
        this.sql = new StringBuffer();
    }

    void initParaList(){
        paraList = new ArrayList<>();
    }


    public SqlParaUtil(){
        ininSql();
//        initParaList();
    }

    public SqlParaUtil(String sql){
        ininSql();
//        initParaList();
        addSql(sql);
    }

    public SqlParaUtil(String sql,Object... params){
        ininSql();
        if(ParamVerifyUtil.verifyTBoolean(params)){
            initParaList();
        }
        addSql(sql);
        for(Object obj : params){
           paraList.add(obj);
        }
    }

    public SqlParaUtil addSqlAndParam(String sql,Object... params){
        for(Object obj : params){
            paraList.add(obj);
        }
        return this;
    }

    public SqlParaUtil addSql(String sql) {
        if (StrKit.notBlank(sql)) {
            this.sql.append(sql);
        }
        return this;
    }

    public SqlParaUtil addPara(Object... params) {
        for(Object param : params){
            paraList.add(param);
        }
        return this;
    }

    public String getSql() {
        return sql.toString();
    }

    /**
     * 获取模糊查询sql
     * @param key 查询关键字
     * @param names 模糊匹配的列
     * @return
     */
    public SqlParaUtil andColsLikeTo(String key,String... names){
        if(ParamVerifyUtil.verifyTBoolean(key,names)){
            this.sql.append(" and (");
            key = ("%"+key+"%");
            for(String name : names){
                if(!ParamVerifyUtil.verifyTBoolean(name)){
                    continue;
                }
                this.sql.append(name).append(" like ?").append(" or");
                this.paraList.add(key);
            }
            this.sql.deleteCharAt( this.sql.length()-2);
            this.sql.append(")");
        }
        return this;
    }

    public SqlParaUtil andColEqualsTo(Object param,String name){
        if(ParamVerifyUtil.verifyTBoolean(param,name)){
            this.sql.append(" and ").append(name).append(" = ?");
            this.paraList.add(param);
        }
        return this;
    }

    public void deleteCharAt(Integer index){
        ParamVerifyUtil.verifyInteger(index);
        this.sql.deleteCharAt(this.sql.length()-index);
    }

}