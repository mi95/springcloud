package com.shop.service;

import java.util.List;
import com.shop.pojo.generate.BrandInfosExample;
import com.shop.pojo.generate.BrandInfos;
public interface BrandInfosService{


    long countByExample(BrandInfosExample example);

    int deleteByExample(BrandInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandInfos record);

    int insertOrUpdate(BrandInfos record);

    int insertOrUpdateSelective(BrandInfos record);

    int insertSelective(BrandInfos record);

    List<BrandInfos> selectByExample(BrandInfosExample example);

    BrandInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(BrandInfos record,BrandInfosExample example);

    int updateByExample(BrandInfos record,BrandInfosExample example);

    int updateByPrimaryKeySelective(BrandInfos record);

    int updateByPrimaryKey(BrandInfos record);

    int updateBatch(List<BrandInfos> list);

    int batchInsert(List<BrandInfos> list);

}
