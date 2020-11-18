package com.shop.service;

import com.shop.pojo.generate.OrderDetailInfosExample;
import com.shop.pojo.generate.OrderDetailInfos;

import java.util.List;

public interface OrderDetailInfosService {


    long countByExample(OrderDetailInfosExample example);

    int deleteByExample(OrderDetailInfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetailInfos record);

    int insertOrUpdate(OrderDetailInfos record);

    int insertOrUpdateSelective(OrderDetailInfos record);

    int insertSelective(OrderDetailInfos record);

    List<OrderDetailInfos> selectByExample(OrderDetailInfosExample example);

    OrderDetailInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(OrderDetailInfos record, OrderDetailInfosExample example);

    int updateByExample(OrderDetailInfos record, OrderDetailInfosExample example);

    int updateByPrimaryKeySelective(OrderDetailInfos record);

    int updateByPrimaryKey(OrderDetailInfos record);

    int updateBatch(List<OrderDetailInfos> list);

    int batchInsert(List<OrderDetailInfos> list);

}
