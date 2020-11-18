package com.info.service.impl;

import com.common.pojo.RespBean;
import com.common.utils.CommonException;
import com.info.mapper.generate.AreaInfoMapper;
import com.info.mapper.generate.CityInfoMapper;
import com.info.mapper.generate.ProvinceInfoMapper;
import com.info.mapper.generate.StreetInfoMapper;
import com.common.pojo.ReqParam;
import com.info.pojo.generate.AreaInfoExample;
import com.info.pojo.generate.CityInfoExample;
import com.info.pojo.generate.StreetInfoExample;
import com.info.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    ProvinceInfoMapper provinceInfoMapper;

    @Autowired
    CityInfoMapper cityInfoMapper;

    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Autowired
    StreetInfoMapper streetInfoMapper;

    @Override
    public RespBean findProvince() {
        return RespBean.success(provinceInfoMapper.selectByExample(null));
    }

    @Override
    public RespBean findCityByProvinceCode(ReqParam param) {
        CommonException.verifyObjects(param,param.getValue());
        CityInfoExample cityInfoExample = new CityInfoExample();
        cityInfoExample.createCriteria().andProvinceCodeEqualTo(param.getValue());
        return RespBean.success(cityInfoMapper.selectByExample(cityInfoExample));
    }

    @Override
    public RespBean findAreaByCityCode(ReqParam param) {
        CommonException.verifyObjects(param,param.getValue());
        AreaInfoExample areaInfoExample = new AreaInfoExample();
        areaInfoExample.createCriteria().andCityCodeEqualTo(param.getValue());
        return RespBean.success(areaInfoMapper.selectByExample(areaInfoExample));
    }

    @Override
    public RespBean findStreetByAreaCode(ReqParam param) {
        CommonException.verifyObjects(param,param.getValue());
        StreetInfoExample streetInfoExample = new StreetInfoExample();
        streetInfoExample.createCriteria().andAreaCodeEqualTo(param.getValue());
        return RespBean.success(streetInfoMapper.selectByExample(streetInfoExample));
    }
}
