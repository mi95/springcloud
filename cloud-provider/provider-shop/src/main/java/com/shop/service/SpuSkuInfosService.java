package com.shop.service;

import com.shop.pojo.generate.SpuSkuInfos;
import com.shop.pojo.generate.SpuSkuInfosExample;
import java.util.List;
public interface SpuSkuInfosService{


    long countByExample(SpuSkuInfosExample example);

    int deleteByExample(SpuSkuInfosExample example);

    int deleteByPrimaryKey(Integer spuId,Integer skuId);

    int insert(SpuSkuInfos record);

    int insertOrUpdate(SpuSkuInfos record);

    int insertOrUpdateSelective(SpuSkuInfos record);

    int insertSelective(SpuSkuInfos record);

    List<SpuSkuInfos> selectByExample(SpuSkuInfosExample example);

    int updateByExampleSelective(SpuSkuInfos record,SpuSkuInfosExample example);

    int updateByExample(SpuSkuInfos record,SpuSkuInfosExample example);

    int updateBatch(List<SpuSkuInfos> list);

    int batchInsert(List<SpuSkuInfos> list);

}
