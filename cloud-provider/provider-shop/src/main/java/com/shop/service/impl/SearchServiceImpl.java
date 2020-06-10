package com.shop.service.impl;

import com.common.pojo.RespBean;
import com.shop.pojo.generate.SpuInfos;
import com.shop.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchService searchService;
    @Autowired
    ElasticsearchRepository repository;

    public RespBean saveEsData(SpuInfos spuInfos) {
        return RespBean.success(repository.save(spuInfos));
    }

    public RespBean deleteEsData(SpuInfos spuInfos){
        repository.delete(spuInfos);
        return RespBean.success();
    }

    public RespBean findEsDataNoPage(){
        return RespBean.success(repository.findAll());
    }

    public RespBean findEsData(){
        Pageable pageable = null;
        return RespBean.success(repository.findAll(pageable));
    }
}
