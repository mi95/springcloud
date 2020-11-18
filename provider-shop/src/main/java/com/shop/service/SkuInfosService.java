package com.shop.service;

import com.shop.pojo.generate.SkuInfosExample;

import java.util.List;

import com.shop.pojo.generate.SkuInfos;

public interface SkuInfosService {


    long countByExample(SkuInfosExample example);

    int deleteByExample(SkuInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkuInfos record);

    int insertOrUpdate(SkuInfos record);

    int insertOrUpdateSelective(SkuInfos record);

    int insertSelective(SkuInfos record);

    List<SkuInfos> selectByExample(SkuInfosExample example);

    SkuInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(SkuInfos record, SkuInfosExample example);

    int updateByExample(SkuInfos record, SkuInfosExample example);

    int updateByPrimaryKeySelective(SkuInfos record);

    int updateByPrimaryKey(SkuInfos record);

    int updateBatch(List<SkuInfos> list);

    int batchInsert(List<SkuInfos> list);

}
