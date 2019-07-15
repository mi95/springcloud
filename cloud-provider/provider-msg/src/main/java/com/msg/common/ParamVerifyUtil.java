package com.msg.common;

import java.util.List;


public class ParamVerifyUtil{
	/**
	 * 判断集合是否为空
	 * @param list
	 * @return
	 */
	public static boolean verifyList(List<?> list){
		return !(list == null || list.size() < 1);
	}
	
	/**
	 * 校验Integer 整形 null或<=0 返回false
	 * @param id
	 * @return
	 */
	public static boolean verifyInteger(Integer... ids){
		for(Integer id :ids){
			if(id == null || id <= 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 校验Long 长整形 null或<=0 返回false
	 * @param id
	 * @return
	 */
	public static boolean verifyLong(Long... ids){
		for(Long id :ids){
			if(id == null || id <= 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 校验Object
	 * @return
	 */
	public static boolean verifyObject(Object... objs){
		for(Object obj :objs){
			if(obj == null || obj == "") {
				return false;
			}
		}
		return true;
	}
}