package com.shop.service;

import com.shop.pojo.generate.SpuInfos;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsService extends ElasticsearchRepository<SpuInfos,Integer> {

}
