package com.info.controller;

import com.common.pojo.RespBean;
import com.common.pojo.ReqParam;
import com.info.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("findProvince")
    public RespBean findProvince(){
        return adminService.findProvince();
    }

    @PostMapping("findCityByProvinceCode")
    public RespBean findCityByProvinceCode(@RequestBody ReqParam param){
        return adminService.findCityByProvinceCode(param);
    }

    @PostMapping("findAreaByCityCode")
    public RespBean findAreaByCityCode(@RequestBody ReqParam param){
        return adminService.findAreaByCityCode(param);
    }

    @PostMapping("findStreetByAreaCode")
    public RespBean findStreetByAreaCode(@RequestBody ReqParam param){
        return adminService.findStreetByAreaCode(param);
    }
}
