package com.shop.mapper.generate;

import com.shop.pojo.generate.SkuInfos;
import com.shop.pojo.generate.SkuInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SkuInfosMapper {
    long countByExample(SkuInfosExample example);

    int deleteByExample(SkuInfosExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(SkuInfos record);

    int insertOrUpdate(SkuInfos record);

    int insertOrUpdateSelective(SkuInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SkuInfos record);

    List<SkuInfos> selectByExample(SkuInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SkuInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkuInfos record, @Param("example") SkuInfosExample example);

    int updateByExample(@Param("record") SkuInfos record, @Param("example") SkuInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SkuInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SkuInfos record);

    int updateBatch(List<SkuInfos> list);

    int batchInsert(@Param("list") List<SkuInfos> list);

    int updateBatchSelective(List<SkuInfos> list);
}