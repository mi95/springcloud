package com.shop.mapper.generate;

import com.shop.pojo.generate.SpuInfos;
import com.shop.pojo.generate.SpuInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpuInfosMapper {
    long countByExample(SpuInfosExample example);

    int deleteByExample(SpuInfosExample example);

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
    int insert(SpuInfos record);

    int insertOrUpdate(SpuInfos record);

    int insertOrUpdateSelective(SpuInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SpuInfos record);

    List<SpuInfos> selectByExample(SpuInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SpuInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpuInfos record, @Param("example") SpuInfosExample example);

    int updateByExample(@Param("record") SpuInfos record, @Param("example") SpuInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SpuInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SpuInfos record);

    int updateBatch(List<SpuInfos> list);

    int batchInsert(@Param("list") List<SpuInfos> list);

    int updateBatchSelective(List<SpuInfos> list);
}