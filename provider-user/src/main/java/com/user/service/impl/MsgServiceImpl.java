package com.user.service.impl;

import com.user.service.MsgService;
import org.springframework.stereotype.Service;

@Service("MsgService")
public class MsgServiceImpl implements MsgService {

    @Override
    public String addMsg(Integer userId, String msg) {
        return "sorry";
    }

}