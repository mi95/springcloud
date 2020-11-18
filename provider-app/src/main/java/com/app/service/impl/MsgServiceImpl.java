package com.app.service.impl;

import com.app.service.MsgService;
import org.springframework.stereotype.Service;

@Service("MsgService")
public class MsgServiceImpl implements MsgService {

    @Override
    public String addMsg(Integer userId, String msg) {
        return "sorry";
    }

}