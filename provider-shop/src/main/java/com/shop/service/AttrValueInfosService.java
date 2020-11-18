package com.shop.service;

import java.util.List;

import com.shop.pojo.generate.AttrValueInfos;
import com.shop.pojo.generate.AttrValueInfosExample;

public interface AttrValueInfosService {


    long countByExample(AttrValueInfosExample example);

    int deleteByExample(AttrValueInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttrValueInfos record);

    int insertOrUpdate(AttrValueInfos record);

    int insertOrUpdateSelective(AttrValueInfos record);

    int insertSelective(AttrValueInfos record);

    List<AttrValueInfos> selectByExample(AttrValueInfosExample example);

    AttrValueInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(AttrValueInfos record, AttrValueInfosExample example);

    int updateByExample(AttrValueInfos record, AttrValueInfosExample example);

    int updateByPrimaryKeySelective(AttrValueInfos record);

    int updateByPrimaryKey(AttrValueInfos record);

    int updateBatch(List<AttrValueInfos> list);

    int batchInsert(List<AttrValueInfos> list);

}
