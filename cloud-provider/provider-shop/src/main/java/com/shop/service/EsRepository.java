package com.shop.service;

import com.shop.pojo.SpuInfosBo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsRepository extends ElasticsearchRepository<SpuInfosBo, Integer> {

    Page<SpuInfosBo> findByName(String name, Pageable pageable);
}
