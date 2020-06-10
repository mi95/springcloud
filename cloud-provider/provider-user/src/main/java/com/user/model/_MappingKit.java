package com.user.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("auth_info", "id", AuthInfo.class);
		arp.addMapping("data_record", "id", DataRecord.class);
		arp.addMapping("goods_info", "id", GoodsInfo.class);
		arp.addMapping("order_detail_info", "id", OrderDetailInfo.class);
		arp.addMapping("order_info", "id", OrderInfo.class);
		arp.addMapping("player_info", "id", PlayerInfo.class);
		// Composite Primary Key order: auth_id,role_id
		arp.addMapping("role_auth_info", "auth_id,role_id", RoleAuthInfo.class);
		arp.addMapping("role_info", "id", RoleInfo.class);
		// Composite Primary Key order: role_id,user_id
		arp.addMapping("role_user_info", "role_id,user_id", RoleUserInfo.class);
		arp.addMapping("user_info", "id", UserInfo.class);
	}
}

