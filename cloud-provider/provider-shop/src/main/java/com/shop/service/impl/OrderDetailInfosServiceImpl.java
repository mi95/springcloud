package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.shop.pojo.generate.OrderDetailInfosExample;
import com.shop.pojo.generate.OrderDetailInfos;
import java.util.List;
import com.shop.mapper.generate.OrderDetailInfosMapper;
import com.shop.service.OrderDetailInfosService;
@Service
public class OrderDetailInfosServiceImpl implements OrderDetailInfosService{

    @Resource
    private OrderDetailInfosMapper orderDetailInfosMapper;

    @Override
    public long countByExample(OrderDetailInfosExample example) {
        return orderDetailInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderDetailInfosExample example) {
        return orderDetailInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderDetailInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderDetailInfos record) {
        return orderDetailInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OrderDetailInfos record) {
        return orderDetailInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OrderDetailInfos record) {
        return orderDetailInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OrderDetailInfos record) {
        return orderDetailInfosMapper.insertSelective(record);
    }

    @Override
    public List<OrderDetailInfos> selectByExample(OrderDetailInfosExample example) {
        return orderDetailInfosMapper.selectByExample(example);
    }

    @Override
    public OrderDetailInfos selectByPrimaryKey(Integer id) {
        return orderDetailInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(OrderDetailInfos record,OrderDetailInfosExample example) {
        return orderDetailInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(OrderDetailInfos record,OrderDetailInfosExample example) {
        return orderDetailInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetailInfos record) {
        return orderDetailInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetailInfos record) {
        return orderDetailInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderDetailInfos> list) {
        return orderDetailInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<OrderDetailInfos> list) {
        return orderDetailInfosMapper.batchInsert(list);
    }

}
