package com.shop.mapper.generate;

import com.shop.pojo.generate.OrderInfos;
import com.shop.pojo.generate.OrderInfosExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderInfosMapper {
    long countByExample(OrderInfosExample example);

    int deleteByExample(OrderInfosExample example);

    /**
     * delete by primary key
     *
     * @param orderNo primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String orderNo);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(OrderInfos record);

    int insertOrUpdate(OrderInfos record);

    int insertOrUpdateSelective(OrderInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(OrderInfos record);

    List<OrderInfos> selectByExample(OrderInfosExample example);

    /**
     * select by primary key
     *
     * @param orderNo primary key
     * @return object by primary key
     */
    OrderInfos selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") OrderInfos record, @Param("example") OrderInfosExample example);

    int updateByExample(@Param("record") OrderInfos record, @Param("example") OrderInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OrderInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OrderInfos record);

    int updateBatch(List<OrderInfos> list);

    int batchInsert(@Param("list") List<OrderInfos> list);

    int updateBatchSelective(List<OrderInfos> list);
}