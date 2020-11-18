package com.shop.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.shop.mapper.generate.OrderInfosMapper;
import com.shop.pojo.generate.OrderInfosExample;
import com.shop.pojo.generate.OrderInfos;
import com.shop.service.OrderInfosService;

@Service
public class OrderInfosServiceImpl implements OrderInfosService {

    @Resource
    private OrderInfosMapper orderInfosMapper;

    @Override
    public long countByExample(OrderInfosExample example) {
        return orderInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderInfosExample example) {
        return orderInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String orderNo) {
        return orderInfosMapper.deleteByPrimaryKey(orderNo);
    }

    @Override
    public int insert(OrderInfos record) {
        return orderInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OrderInfos record) {
        return orderInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OrderInfos record) {
        return orderInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OrderInfos record) {
        return orderInfosMapper.insertSelective(record);
    }

    @Override
    public List<OrderInfos> selectByExample(OrderInfosExample example) {
        return orderInfosMapper.selectByExample(example);
    }

    @Override
    public OrderInfos selectByPrimaryKey(String orderNo) {
        return orderInfosMapper.selectByPrimaryKey(orderNo);
    }

    @Override
    public int updateByExampleSelective(OrderInfos record, OrderInfosExample example) {
        return orderInfosMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderInfos record, OrderInfosExample example) {
        return orderInfosMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderInfos record) {
        return orderInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderInfos record) {
        return orderInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderInfos> list) {
        return orderInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OrderInfos> list) {
        return orderInfosMapper.batchInsert(list);
    }

}
