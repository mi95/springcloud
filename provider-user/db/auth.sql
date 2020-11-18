-- CREATE DATABASE db_user;
-- use db_user;
Truncate table auth_info;
INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('100','数据管理',0,'/data',1);
	INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('100100','数据列表',100,'',2);
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('100100100','查询',100100,'',"",'',3,'search');

INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101','权限管理',0,'/auth',1);
	INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101100','用户列表',101,'/user',2);
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101100100','查询',101100,'',3,'search');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101100101','新增',101100,'',3,'add');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101100102','禁用',101100,'',3,'del');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101100103','重置密码',101100,'',3,'reset');

	INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101','角色管理',101,'/role',"pages/auth/role/Roles",'',2);
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101100','查询',101101,'',3,'search');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101101','新增',101101,'',3,'add');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101102','添加用户',101101,'',3,'addUser');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101103','删除用户',101101,'',3,'delUser');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101104','添加权限',101101,'',3,'addAuth');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101105','编辑角色',101101,'',3,'edit');
		INSERT INTO auth_info (id,name,father_id,path,type) VALUES ('101101106','禁用角色',101101,'',3,'del');