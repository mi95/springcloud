package com.msg.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.msg.common.ParamVerifyUtil;
import com.msg.common.ServiceErrorUtil;
import com.msg.mapper.MsgMapper;
import com.msg.service.MsgService;

@Service("MsgService")
public class MsgServiceImpl implements MsgService{

	@Autowired
	MsgMapper msgMapper;
	
	@Override
	public void replyMsg(Integer userId, String msg, Integer id) {
		ParamVerifyUtil.verifyInteger(userId,id);
		ParamVerifyUtil.verifyObject(msg);
		ServiceErrorUtil.errInteger(msgMapper.replyMsg(userId, msg, id));
	}

	@Override
	public Page<Map<String, Object>> findMsgPageList(Integer pageNum, Integer pageSize, Integer userId, Integer state) {
		ParamVerifyUtil.verifyInteger(pageNum,pageSize);
		PageHelper.startPage(pageNum, pageSize);
		return msgMapper.findMsgPageList(userId, state);
	}

	@Override
	public void addMsg(Integer userId, String msg) {
		ParamVerifyUtil.verifyInteger(userId);
		ParamVerifyUtil.verifyObject(msg);
		ServiceErrorUtil.errInteger(msgMapper.addMsg(userId, msg));
	}
	
}