package com.shop.mapper.generate;

import com.shop.pojo.generate.OrderDetailInfos;
import com.shop.pojo.generate.OrderDetailInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDetailInfosMapper {
    long countByExample(OrderDetailInfosExample example);

    int deleteByExample(OrderDetailInfosExample example);

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
    int insert(OrderDetailInfos record);

    int insertOrUpdate(OrderDetailInfos record);

    int insertOrUpdateSelective(OrderDetailInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(OrderDetailInfos record);

    List<OrderDetailInfos> selectByExample(OrderDetailInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    OrderDetailInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetailInfos record, @Param("example") OrderDetailInfosExample example);

    int updateByExample(@Param("record") OrderDetailInfos record, @Param("example") OrderDetailInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OrderDetailInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OrderDetailInfos record);

    int updateBatch(List<OrderDetailInfos> list);

    int batchInsert(@Param("list") List<OrderDetailInfos> list);

    int updateBatchSelective(List<OrderDetailInfos> list);
}