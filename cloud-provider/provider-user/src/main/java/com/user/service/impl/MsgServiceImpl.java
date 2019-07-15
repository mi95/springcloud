package com.user.service.impl;

import org.springframework.stereotype.Service;

import com.user.service.MsgService;

@Service("MsgService")
public class MsgServiceImpl implements MsgService{

	@Override
	public String addMsg(Integer userId, String msg) {
		return "sorry";
	}

}