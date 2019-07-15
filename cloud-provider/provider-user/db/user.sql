-- CREATE DATABASE db_user;
-- use db_user;
---------------------------------用户-begin--------------------------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `account` char(100) COLLATE utf8_bin not null comment '账号',
  `pwd` char(100) COLLATE utf8_bin not null comment '密码',
  `state` tinyint default 1 not null comment '可用状态 1-可用 2-禁用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_account` (`account`),
  INDEX `IX_pwd` (`pwd`),
  INDEX `IX_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '账号信息表';
INSERT INTO `user_info` (`id`, `account`,`pwd`) VALUES ('1', 'admin', 'admin');
---------------------------------用户-end--------------------------------------------