package com.shop.service;

import java.util.List;
import com.shop.pojo.generate.SpuImgInfos;
import com.shop.pojo.generate.SpuImgInfosExample;
public interface SpuImgInfosService{


    long countByExample(SpuImgInfosExample example);

    int deleteByExample(SpuImgInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpuImgInfos record);

    int insertOrUpdate(SpuImgInfos record);

    int insertOrUpdateSelective(SpuImgInfos record);

    int insertSelective(SpuImgInfos record);

    List<SpuImgInfos> selectByExample(SpuImgInfosExample example);

    SpuImgInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(SpuImgInfos record,SpuImgInfosExample example);

    int updateByExample(SpuImgInfos record,SpuImgInfosExample example);

    int updateByPrimaryKeySelective(SpuImgInfos record);

    int updateByPrimaryKey(SpuImgInfos record);

    int updateBatch(List<SpuImgInfos> list);

    int batchInsert(List<SpuImgInfos> list);

}
