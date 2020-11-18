package com.shop.mapper.generate;

import com.shop.pojo.generate.SpuSkuInfos;
import com.shop.pojo.generate.SpuSkuInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpuSkuInfosMapper {
    long countByExample(SpuSkuInfosExample example);

    int deleteByExample(SpuSkuInfosExample example);

    /**
     * delete by primary key
     *
     * @param spuId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("spuId") Integer spuId, @Param("skuId") Integer skuId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(SpuSkuInfos record);

    int insertOrUpdate(SpuSkuInfos record);

    int insertOrUpdateSelective(SpuSkuInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SpuSkuInfos record);

    List<SpuSkuInfos> selectByExample(SpuSkuInfosExample example);

    int updateByExampleSelective(@Param("record") SpuSkuInfos record, @Param("example") SpuSkuInfosExample example);

    int updateByExample(@Param("record") SpuSkuInfos record, @Param("example") SpuSkuInfosExample example);

    int updateBatch(List<SpuSkuInfos> list);

    int batchInsert(@Param("list") List<SpuSkuInfos> list);

    int updateBatchSelective(List<SpuSkuInfos> list);
}