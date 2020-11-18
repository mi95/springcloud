package com.shop.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.shop.pojo.generate.SkuInfosExample;

import java.util.List;

import com.shop.mapper.generate.SkuInfosMapper;
import com.shop.pojo.generate.SkuInfos;
import com.shop.service.SkuInfosService;

@Service
public class SkuInfosServiceImpl implements SkuInfosService {

    @Resource
    private SkuInfosMapper skuInfosMapper;

    @Override
    public long countByExample(SkuInfosExample example) {
        return skuInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SkuInfosExample example) {
        return skuInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return skuInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SkuInfos record) {
        return skuInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SkuInfos record) {
        return skuInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SkuInfos record) {
        return skuInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SkuInfos record) {
        return skuInfosMapper.insertSelective(record);
    }

    @Override
    public List<SkuInfos> selectByExample(SkuInfosExample example) {
        return skuInfosMapper.selectByExample(example);
    }

    @Override
    public SkuInfos selectByPrimaryKey(Integer id) {
        return skuInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SkuInfos record, SkuInfosExample example) {
        return skuInfosMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SkuInfos record, SkuInfosExample example) {
        return skuInfosMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SkuInfos record) {
        return skuInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkuInfos record) {
        return skuInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SkuInfos> list) {
        return skuInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SkuInfos> list) {
        return skuInfosMapper.batchInsert(list);
    }

}
