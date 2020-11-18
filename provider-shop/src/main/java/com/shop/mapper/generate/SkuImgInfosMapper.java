package com.shop.mapper.generate;

import com.shop.pojo.generate.SkuImgInfos;
import com.shop.pojo.generate.SkuImgInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SkuImgInfosMapper {
    long countByExample(SkuImgInfosExample example);

    int deleteByExample(SkuImgInfosExample example);

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
    int insert(SkuImgInfos record);

    int insertOrUpdate(SkuImgInfos record);

    int insertOrUpdateSelective(SkuImgInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SkuImgInfos record);

    List<SkuImgInfos> selectByExample(SkuImgInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SkuImgInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkuImgInfos record, @Param("example") SkuImgInfosExample example);

    int updateByExample(@Param("record") SkuImgInfos record, @Param("example") SkuImgInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SkuImgInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SkuImgInfos record);

    int updateBatch(List<SkuImgInfos> list);

    int batchInsert(@Param("list") List<SkuImgInfos> list);

    int updateBatchSelective(List<SkuImgInfos> list);
}