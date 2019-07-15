package com.user.common;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.SqlPara;

public class SqlParaUtil extends SqlPara{
	private static final long serialVersionUID = 8458822473666095496L;
	private StringBuffer sql;
	private List<Object> paraList;
	
	public SqlParaUtil addSql(String sql) {
		if(this.sql == null) {
			this.sql = new StringBuffer();
		}
		if(StrKit.notBlank(sql)) {
			this.sql.append(sql);
		}
		return this;
	}
	
	public SqlParaUtil addPara(Object para) {
		if(!ParamVerifyUtil.verifyList(paraList)) {
			paraList = new ArrayList<Object>();
		}
		paraList.add(para);
		return this;
	}

	public String getSql() {
		return sql.toString();
	}

	public Object[] getPara() {
		if (paraList == null || paraList.size() == 0) {
			return null;
		} else {
			return paraList.toArray(new Object[paraList.size()]);
		}
	}

}