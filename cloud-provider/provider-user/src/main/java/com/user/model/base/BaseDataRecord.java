package com.user.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDataRecord<M extends BaseDataRecord<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setPlayerNum(java.lang.Long playerNum) {
		set("player_num", playerNum);
		return (M)this;
	}
	
	public java.lang.Long getPlayerNum() {
		return getLong("player_num");
	}

	public M setRechargeAmountNum(java.lang.Long rechargeAmountNum) {
		set("recharge_amount_num", rechargeAmountNum);
		return (M)this;
	}
	
	public java.lang.Long getRechargeAmountNum() {
		return getLong("recharge_amount_num");
	}

	public M setRechargePeopleNum(java.lang.Long rechargePeopleNum) {
		set("recharge_people_num", rechargePeopleNum);
		return (M)this;
	}
	
	public java.lang.Long getRechargePeopleNum() {
		return getLong("recharge_people_num");
	}

	public M setAliveNum(java.lang.Long aliveNum) {
		set("alive_num", aliveNum);
		return (M)this;
	}
	
	public java.lang.Long getAliveNum() {
		return getLong("alive_num");
	}

	public M setPlayerSum(java.lang.Long playerSum) {
		set("player_sum", playerSum);
		return (M)this;
	}
	
	public java.lang.Long getPlayerSum() {
		return getLong("player_sum");
	}

	public M setRechargeAmountSum(java.lang.Long rechargeAmountSum) {
		set("recharge_amount_sum", rechargeAmountSum);
		return (M)this;
	}
	
	public java.lang.Long getRechargeAmountSum() {
		return getLong("recharge_amount_sum");
	}

	public M setRechargePeopleSum(java.lang.Long rechargePeopleSum) {
		set("recharge_people_sum", rechargePeopleSum);
		return (M)this;
	}
	
	public java.lang.Long getRechargePeopleSum() {
		return getLong("recharge_people_sum");
	}

	public M setRetentionRateTwo(java.lang.Long retentionRateTwo) {
		set("retention_rate_two", retentionRateTwo);
		return (M)this;
	}
	
	public java.lang.Long getRetentionRateTwo() {
		return getLong("retention_rate_two");
	}

	public M setRetentionRateThree(java.lang.Long retentionRateThree) {
		set("retention_rate_three", retentionRateThree);
		return (M)this;
	}
	
	public java.lang.Long getRetentionRateThree() {
		return getLong("retention_rate_three");
	}

	public M setRechargeAmountAndroid(java.lang.Long rechargeAmountAndroid) {
		set("recharge_amount_android", rechargeAmountAndroid);
		return (M)this;
	}
	
	public java.lang.Long getRechargeAmountAndroid() {
		return getLong("recharge_amount_android");
	}

	public M setRechargeAmountIos(java.lang.Long rechargeAmountIos) {
		set("recharge_amount_ios", rechargeAmountIos);
		return (M)this;
	}
	
	public java.lang.Long getRechargeAmountIos() {
		return getLong("recharge_amount_ios");
	}

	public M setRechargeOne(java.lang.Long rechargeOne) {
		set("recharge_one", rechargeOne);
		return (M)this;
	}
	
	public java.lang.Long getRechargeOne() {
		return getLong("recharge_one");
	}

	public M setRechargeTwo(java.lang.Long rechargeTwo) {
		set("recharge_two", rechargeTwo);
		return (M)this;
	}
	
	public java.lang.Long getRechargeTwo() {
		return getLong("recharge_two");
	}

	public M setRechargeThree(java.lang.Long rechargeThree) {
		set("recharge_three", rechargeThree);
		return (M)this;
	}
	
	public java.lang.Long getRechargeThree() {
		return getLong("recharge_three");
	}

	public M setRechargeFour(java.lang.Long rechargeFour) {
		set("recharge_four", rechargeFour);
		return (M)this;
	}
	
	public java.lang.Long getRechargeFour() {
		return getLong("recharge_four");
	}

	public M setRechargeFive(java.lang.Long rechargeFive) {
		set("recharge_five", rechargeFive);
		return (M)this;
	}
	
	public java.lang.Long getRechargeFive() {
		return getLong("recharge_five");
	}

	public M setRechargeSix(java.lang.Long rechargeSix) {
		set("recharge_six", rechargeSix);
		return (M)this;
	}
	
	public java.lang.Long getRechargeSix() {
		return getLong("recharge_six");
	}

	public M setRecordDate(java.util.Date recordDate) {
		set("record_date", recordDate);
		return (M)this;
	}
	
	public java.util.Date getRecordDate() {
		return get("record_date");
	}

	public M setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
		return (M)this;
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

}
