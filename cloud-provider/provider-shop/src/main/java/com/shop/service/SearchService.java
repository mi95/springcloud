package com.shop.service;

import com.common.pojo.RespBean;
import com.shop.pojo.generate.SpuInfos;

public interface SearchService {
    RespBean saveEsData(SpuInfos spuInfos);

    RespBean deleteEsData(SpuInfos spuInfos);

    RespBean findEsDataNoPage();

    RespBean findEsData();
}
