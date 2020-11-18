package com.shop.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.shop.mapper.generate.SpuInfosMapper;
import com.shop.pojo.generate.SpuInfosExample;
import com.shop.pojo.generate.SpuInfos;
import com.shop.service.SpuInfosService;

@Service
public class SpuInfosServiceImpl implements SpuInfosService {

    @Resource
    private SpuInfosMapper spuInfosMapper;

    @Override
    public long countByExample(SpuInfosExample example) {
        return spuInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SpuInfosExample example) {
        return spuInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return spuInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SpuInfos record) {
        return spuInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SpuInfos record) {
        return spuInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SpuInfos record) {
        return spuInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SpuInfos record) {
        return spuInfosMapper.insertSelective(record);
    }

    @Override
    public List<SpuInfos> selectByExample(SpuInfosExample example) {
        return spuInfosMapper.selectByExample(example);
    }

    @Override
    public SpuInfos selectByPrimaryKey(Integer id) {
        return spuInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SpuInfos record, SpuInfosExample example) {
        return spuInfosMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SpuInfos record, SpuInfosExample example) {
        return spuInfosMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SpuInfos record) {
        return spuInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpuInfos record) {
        return spuInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SpuInfos> list) {
        return spuInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SpuInfos> list) {
        return spuInfosMapper.batchInsert(list);
    }

}

