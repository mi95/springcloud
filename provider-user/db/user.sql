-- CREATE DATABASE db_user;
-- use db_user;
---------------------------------用户-begin--------------------------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `user_name` char(100)  not null comment '账号',
  `pwd` char(100)  not null comment '密码',
  `state` tinyint default 1 not null comment '可用状态 1-可用 2-禁用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_user_name` (`user_name`),
  INDEX `idx_pwd` (`pwd`),
  INDEX `idx_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '账号信息表';
INSERT INTO `user_info` (`id`, `user_name`,`pwd`) VALUES ('1', 'admin', 'admin');
---------------------------------用户-end--------------------------------------------

---------------------------------订单-begin--------------------------------------------
DROP TABLE IF EXISTS `goods_info`;
CREATE TABLE `goods_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` int(11) unsigned NOT NULL  comment '商品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '商品信息';

DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `user_id` int(11) unsigned NOT NULL  comment '用户编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '订单信息';

DROP TABLE IF EXISTS `order_detail_info`;
CREATE TABLE `order_detail_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `order_id` int(11) unsigned NOT NULL comment '订单编号',
  `goods_id` int(11) unsigned NOT NULL comment '商品编号',
  `num` char(100)  not null comment '商品数量',
  PRIMARY KEY (`id`),
  INDEX `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '订单详情';
---------------------------------订单-end--------------------------------------------


-- ------------------------------权限菜单-start--------------------------------------------
DROP TABLE IF EXISTS `auth_info`;
CREATE TABLE `auth_info` (
  `id` int(11) unsigned NOT NULL comment '主键',
  `name` varchar(100)  not null comment '名称',
  `father_id` int(11) unsigned NOT NULL default 0 comment '父编号',
  `path` char(50)  not null default '' comment '路径',
  `request_method` char(50)  not null default '' comment '请求方式',
  `type` tinyint not null default 1 comment '权限类型 1-父菜单 2-子菜单 3-按钮',
  `state` tinyint not null default 1 comment '状态 1-可用 2-禁用',
  PRIMARY KEY (`id`),
  unique key `uk_path_request_method`(`path`,`request_method`),
  index `idx_father_id` (`father_id`),
  index `idx_type` (`type`),
  index `idx_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '权限菜单';

DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` varchar(100)  not null comment '名称',
  `comment` varchar(2000)  not null default '' comment '描述',
  `state` tinyint not null default 1 comment '状态 1-可用 2-禁用',
  PRIMARY KEY (`id`),
  index `idx_name` (`name`),
  index `idx_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '角色信息';

DROP TABLE IF EXISTS `role_auth_info`;
CREATE TABLE `role_auth_info` (
  `role_id` int(11) unsigned NOT NULL comment '角色编号',
  `auth_id` int(11) unsigned NOT NULL comment '权限编号',
  PRIMARY KEY (`role_id`,`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '角色权限关联';

DROP TABLE IF EXISTS `role_user_info`;
CREATE TABLE `role_user_info` (
  `role_id` int(11) unsigned NOT NULL comment '角色编号',
  `user_id` int(11) unsigned NOT NULL comment '用户编号',
  PRIMARY KEY (`role_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '角色权限关联';

INSERT INTO role_info (`name`, `comment`) VALUES ('admin', '超级管理员');
insert into role_auth_info select 1,id from auth_info;
insert into role_user_info VALUES (1,1);
-- -------------------------------权限菜单-end-------------------------------------------
