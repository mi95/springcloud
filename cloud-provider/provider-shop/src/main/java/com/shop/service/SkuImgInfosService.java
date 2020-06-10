package com.shop.service;

import com.shop.pojo.generate.SkuImgInfos;
import java.util.List;
import com.shop.pojo.generate.SkuImgInfosExample;
public interface SkuImgInfosService{


    long countByExample(SkuImgInfosExample example);

    int deleteByExample(SkuImgInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkuImgInfos record);

    int insertOrUpdate(SkuImgInfos record);

    int insertOrUpdateSelective(SkuImgInfos record);

    int insertSelective(SkuImgInfos record);

    List<SkuImgInfos> selectByExample(SkuImgInfosExample example);

    SkuImgInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(SkuImgInfos record,SkuImgInfosExample example);

    int updateByExample(SkuImgInfos record,SkuImgInfosExample example);

    int updateByPrimaryKeySelective(SkuImgInfos record);

    int updateByPrimaryKey(SkuImgInfos record);

    int updateBatch(List<SkuImgInfos> list);

    int batchInsert(List<SkuImgInfos> list);

}
