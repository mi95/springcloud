package com.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msg.service.MsgService;

@RestController
@RequestMapping("/msg")
public class MsgController extends BaseController{
	@Autowired
	MsgService msgService;
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/test")
	public String test() {
		return "this is:"+port;
	}
	@PostMapping("/msg")
	public String addMsg(Integer userId,String msg) {
		msgService.addMsg(userId, msg);
		return port;
	}
	
	@PatchMapping("/msg")
	public ModelMap replyMsg(int userId,String msg,int id) {
		msgService.replyMsg(userId, msg, id);
		return renderSuccess();
	}
	
	@GetMapping("/msgPage")
	public ModelMap findMsgPageList(Integer pageNum,Integer pageSize,Integer userId,Integer state){
		return returnPageList(msgService.findMsgPageList(pageNum, pageSize, userId, state));
	}
}