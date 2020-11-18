//package com.common.controller;
//
//import com.common.amqp.AmqpProducer;
//import com.common.pojo.RespBody;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/amqp")
//public class AmqpController extends BaseController {
//    @Autowired
//    AmqpProducer amqpProducer;
//
//    @GetMapping("/send")
//    public RespBody sendMsg() {
//        amqpProducer.send();
//        return renderSuccess();
//    }
//
//    @GetMapping("/fanoutSend")
//    public ModelMap fanoutSend() {
//        amqpProducer.fanoutSend();
//        return renderSuccess();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(11);
//    }
//}