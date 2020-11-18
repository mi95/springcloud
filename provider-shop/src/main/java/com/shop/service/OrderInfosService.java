package com.shop.service;

import java.util.List;

import com.shop.pojo.generate.OrderInfosExample;
import com.shop.pojo.generate.OrderInfos;

public interface OrderInfosService {


    long countByExample(OrderInfosExample example);

    int deleteByExample(OrderInfosExample example);

    int deleteByPrimaryKey(String orderNo);

    int insert(OrderInfos record);

    int insertOrUpdate(OrderInfos record);

    int insertOrUpdateSelective(OrderInfos record);

    int insertSelective(OrderInfos record);

    List<OrderInfos> selectByExample(OrderInfosExample example);

    OrderInfos selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(OrderInfos record, OrderInfosExample example);

    int updateByExample(OrderInfos record, OrderInfosExample example);

    int updateByPrimaryKeySelective(OrderInfos record);

    int updateByPrimaryKey(OrderInfos record);

    int updateBatch(List<OrderInfos> list);

    int batchInsert(List<OrderInfos> list);

}
