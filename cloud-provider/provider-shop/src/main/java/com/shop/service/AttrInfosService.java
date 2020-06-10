package com.shop.service;

import java.util.List;
import com.shop.pojo.generate.AttrInfosExample;
import com.shop.pojo.generate.AttrInfos;
public interface AttrInfosService{


    long countByExample(AttrInfosExample example);

    int deleteByExample(AttrInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttrInfos record);

    int insertOrUpdate(AttrInfos record);

    int insertOrUpdateSelective(AttrInfos record);

    int insertSelective(AttrInfos record);

    List<AttrInfos> selectByExample(AttrInfosExample example);

    AttrInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(AttrInfos record,AttrInfosExample example);

    int updateByExample(AttrInfos record,AttrInfosExample example);

    int updateByPrimaryKeySelective(AttrInfos record);

    int updateByPrimaryKey(AttrInfos record);

    int updateBatch(List<AttrInfos> list);

    int batchInsert(List<AttrInfos> list);

}
