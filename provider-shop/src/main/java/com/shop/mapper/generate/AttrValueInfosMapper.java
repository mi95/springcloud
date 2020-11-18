package com.shop.mapper.generate;

import com.shop.pojo.generate.AttrValueInfos;
import com.shop.pojo.generate.AttrValueInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttrValueInfosMapper {
    long countByExample(AttrValueInfosExample example);

    int deleteByExample(AttrValueInfosExample example);

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
    int insert(AttrValueInfos record);

    int insertOrUpdate(AttrValueInfos record);

    int insertOrUpdateSelective(AttrValueInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AttrValueInfos record);

    List<AttrValueInfos> selectByExample(AttrValueInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AttrValueInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttrValueInfos record, @Param("example") AttrValueInfosExample example);

    int updateByExample(@Param("record") AttrValueInfos record, @Param("example") AttrValueInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AttrValueInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AttrValueInfos record);

    int updateBatch(List<AttrValueInfos> list);

    int batchInsert(@Param("list") List<AttrValueInfos> list);

    int updateBatchSelective(List<AttrValueInfos> list);
}