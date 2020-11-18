package com.shop.mapper.generate;

import com.shop.pojo.generate.AttrInfos;
import com.shop.pojo.generate.AttrInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttrInfosMapper {
    long countByExample(AttrInfosExample example);

    int deleteByExample(AttrInfosExample example);

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
    int insert(AttrInfos record);

    int insertOrUpdate(AttrInfos record);

    int insertOrUpdateSelective(AttrInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AttrInfos record);

    List<AttrInfos> selectByExample(AttrInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AttrInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttrInfos record, @Param("example") AttrInfosExample example);

    int updateByExample(@Param("record") AttrInfos record, @Param("example") AttrInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AttrInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AttrInfos record);

    int updateBatch(List<AttrInfos> list);

    int batchInsert(@Param("list") List<AttrInfos> list);

    int updateBatchSelective(List<AttrInfos> list);
}