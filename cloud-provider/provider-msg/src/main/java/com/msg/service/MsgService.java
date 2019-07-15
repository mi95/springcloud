package com.msg.service;

import java.util.Map;

import com.github.pagehelper.Page;

public interface MsgService{
	public void addMsg(Integer userId,String msg);
	
	public void replyMsg(Integer userId,String msg,Integer id);
	
	public Page<Map<String, Object>> findMsgPageList(Integer pageNum,Integer pageSize,Integer userId,Integer state);
}