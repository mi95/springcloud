-- CREATE DATABASE db_msg;
-- use db_msg;
---------------------------------用户-begin--------------------------------------------
DROP TABLE IF EXISTS `msg_info`;
CREATE TABLE `msg_info` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `user_id` int(11) unsigned NOT NULL comment '用户编号',
  `msg` varchar(1000) COLLATE utf8_bin not null default '' comment '消息',
  `reply_msg` varchar(1000) COLLATE utf8_bin not null default '' comment '回复消息',
  `reply_user_id` int(11) unsigned NOT NULL default 0 comment '处理人编号',
  `state` tinyint default 1 not null comment '可用状态 1-未处理 2-已处理',
  `reply_time` datetime comment '回复时间',
  `create_time` datetime default now() comment '创建时间',
  PRIMARY KEY (`id`),
  INDEX `IX_user_id` (`user_id`),
  INDEX `IX_reply_user_id` (`reply_user_id`),
  INDEX `IX_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '消息表';
---------------------------------用户-end--------------------------------------------