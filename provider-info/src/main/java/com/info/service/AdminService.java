package com.info.service;


import com.common.pojo.RespBean;
import com.common.pojo.ReqParam;

public interface AdminService {
    RespBean findProvince();

    RespBean findCityByProvinceCode(ReqParam param);

    RespBean findAreaByCityCode(ReqParam param);

    RespBean findStreetByAreaCode(ReqParam param);
}
