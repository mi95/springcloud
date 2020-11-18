package com.shop.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.shop.pojo.generate.SpuSkuInfos;
import com.shop.pojo.generate.SpuSkuInfosExample;

import java.util.List;

import com.shop.mapper.generate.SpuSkuInfosMapper;
import com.shop.service.SpuSkuInfosService;

@Service
public class SpuSkuInfosServiceImpl implements SpuSkuInfosService {

    @Resource
    private SpuSkuInfosMapper spuSkuInfosMapper;

    @Override
    public long countByExample(SpuSkuInfosExample example) {
        return spuSkuInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SpuSkuInfosExample example) {
        return spuSkuInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer spuId, Integer skuId) {
        return spuSkuInfosMapper.deleteByPrimaryKey(spuId, skuId);
    }

    @Override
    public int insert(SpuSkuInfos record) {
        return spuSkuInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SpuSkuInfos record) {
        return spuSkuInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SpuSkuInfos record) {
        return spuSkuInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SpuSkuInfos record) {
        return spuSkuInfosMapper.insertSelective(record);
    }

    @Override
    public List<SpuSkuInfos> selectByExample(SpuSkuInfosExample example) {
        return spuSkuInfosMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SpuSkuInfos record, SpuSkuInfosExample example) {
        return spuSkuInfosMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SpuSkuInfos record, SpuSkuInfosExample example) {
        return spuSkuInfosMapper.updateByExample(record, example);
    }

    @Override
    public int updateBatch(List<SpuSkuInfos> list) {
        return spuSkuInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SpuSkuInfos> list) {
        return spuSkuInfosMapper.batchInsert(list);
    }

}
