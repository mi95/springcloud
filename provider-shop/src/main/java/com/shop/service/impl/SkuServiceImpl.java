package com.shop.service.impl;

import com.shop.mapper.generate.SkuInfosMapper;
import com.shop.service.SkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SkuServiceImpl implements SkuService {

    @Resource
    private SkuInfosMapper skuInfosMapper;

}




