-- CREATE DATABASE db_shop;
-- use db_shop;
-- -------------------------------商品-begin--------------------------------------------
DROP TABLE IF EXISTS `spu_infos`;
CREATE TABLE `spu_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` varchar(30) NOT NULL  comment 'spu名称',
  `status` int(11) unsigned default 1 NOT NULL comment '状态 1-未上架 2-已上架',
  PRIMARY KEY (`id`),
  unique key `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = 'spu信息';

DROP TABLE IF EXISTS `spu_img_infos`;
CREATE TABLE `spu_img_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `spu_id` int(11) unsigned NOT NULL comment 'spu编号',
  `url` char(100) NOT NULL comment 'url',
  PRIMARY KEY (`id`),
  index `idx_spu_id` (`spu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = 'spu图片信息';

DROP TABLE IF EXISTS `sku_infos`;
CREATE TABLE `sku_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` varchar(30) NOT NULL  comment 'sku名称',
  `stock_num` int(11) unsigned NOT NULL default 0 comment '库存数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = 'sku信息';

DROP TABLE IF EXISTS `sku_img_infos`;
CREATE TABLE `sku_img_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `sku_id` int(11) unsigned NOT NULL comment 'sku编号',
  `url` char(100) NOT NULL comment 'url',
  PRIMARY KEY (`id`),
  index `idx_sku_id` (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = 'sku图片信息';

DROP TABLE IF EXISTS `spu_sku_infos`;
CREATE TABLE `spu_sku_infos` (
  `spu_id` int(11) unsigned NOT NULL comment 'spu编号',
  `sku_id` int(11) unsigned NOT NULL  comment 'sku编号',
  PRIMARY KEY (`spu_id`,`sku_id`),
  index `idx_sku_id` (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = 'sku关联sku信息';

-- --------------------属性-begin-------------------
DROP TABLE IF EXISTS `attr_infos`;
CREATE TABLE `attr_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` varchar(30) NOT NULL  comment '属性名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '属性表';

DROP TABLE IF EXISTS `attr_value_infos`;
CREATE TABLE `attr_value_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `attr_id` int(11) unsigned NOT NULL comment '属性编号',
  `name` varchar(30) NOT NULL  comment '属性值',
  PRIMARY KEY (`id`),
  index `idx_attr_id` (`attr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '属性值表';
-- ----------------------属性-end-------------------
-- --------------------品牌-begin-------------------
DROP TABLE IF EXISTS `brand_infos`;
CREATE TABLE `brand_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `name` varchar(30) NOT NULL  comment '品牌名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '属性表';
-- ----------------------品牌-end-------------------
-- -------------------------------商品-end--------------------------------------------
-- -------------------------------订单-begin--------------------------------------------
DROP TABLE IF EXISTS `order_infos`;
CREATE TABLE `order_infos` (
  `order_no` char(20) NOT NULL  comment '订单号',
  `create_time` datetime not null default now() comment '创建时间',
  `create_id` int(11) unsigned not null default now() comment '创建人编号',
  `update_time` datetime not null default now() comment '修改时间',
  `update_id` int(11) unsigned not null default now() comment '修改人编号',
  PRIMARY KEY (`order_no`),
  index `idx_create_id` (`create_id`),
  index `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '订单信息';

DROP TABLE IF EXISTS `order_detail_infos`;
CREATE TABLE `order_detail_infos` (
  `id` int(11) unsigned auto_increment NOT NULL comment '主键',
  `order_id` int(11) unsigned NOT NULL comment '订单编号',
  `goods_id` int(11) unsigned NOT NULL comment '商品编号',
  `num` char(100)  not null comment '商品数量',
  PRIMARY KEY (`id`),
  unique key `uk_order_id_goods_id` (`order_id`,`goods_id`),
  INDEX `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin comment = '订单详情';
-- -------------------------------订单-end--------------------------------------------
