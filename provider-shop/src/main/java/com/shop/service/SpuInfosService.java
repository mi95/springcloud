package com.shop.service;

import java.util.List;

import com.shop.pojo.generate.SpuInfosExample;
import com.shop.pojo.generate.SpuInfos;

public interface SpuInfosService {


    long countByExample(SpuInfosExample example);

    int deleteByExample(SpuInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpuInfos record);

    int insertOrUpdate(SpuInfos record);

    int insertOrUpdateSelective(SpuInfos record);

    int insertSelective(SpuInfos record);

    List<SpuInfos> selectByExample(SpuInfosExample example);

    SpuInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(SpuInfos record, SpuInfosExample example);

    int updateByExample(SpuInfos record, SpuInfosExample example);

    int updateByPrimaryKeySelective(SpuInfos record);

    int updateByPrimaryKey(SpuInfos record);

    int updateBatch(List<SpuInfos> list);

    int batchInsert(List<SpuInfos> list);

}

