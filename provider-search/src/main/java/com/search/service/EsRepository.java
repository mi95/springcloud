package com.search.service;

import com.search.pojo.UserInfosBo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface EsRepository extends ElasticsearchRepository<UserInfosBo, Integer> {
    Page<UserInfosBo> findAll(Pageable pageable);
    Optional<UserInfosBo> findById(Integer id);
    Page<UserInfosBo> findByUserName(String userName, Pageable pageable);
}
