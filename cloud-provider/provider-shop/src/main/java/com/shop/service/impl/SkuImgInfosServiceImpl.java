package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.shop.pojo.generate.SkuImgInfos;
import java.util.List;
import com.shop.pojo.generate.SkuImgInfosExample;
import com.shop.mapper.generate.SkuImgInfosMapper;
import com.shop.service.SkuImgInfosService;
@Service
public class SkuImgInfosServiceImpl implements SkuImgInfosService{

    @Resource
    private SkuImgInfosMapper skuImgInfosMapper;

    @Override
    public long countByExample(SkuImgInfosExample example) {
        return skuImgInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SkuImgInfosExample example) {
        return skuImgInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return skuImgInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SkuImgInfos record) {
        return skuImgInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SkuImgInfos record) {
        return skuImgInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SkuImgInfos record) {
        return skuImgInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SkuImgInfos record) {
        return skuImgInfosMapper.insertSelective(record);
    }

    @Override
    public List<SkuImgInfos> selectByExample(SkuImgInfosExample example) {
        return skuImgInfosMapper.selectByExample(example);
    }

    @Override
    public SkuImgInfos selectByPrimaryKey(Integer id) {
        return skuImgInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SkuImgInfos record,SkuImgInfosExample example) {
        return skuImgInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SkuImgInfos record,SkuImgInfosExample example) {
        return skuImgInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SkuImgInfos record) {
        return skuImgInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkuImgInfos record) {
        return skuImgInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SkuImgInfos> list) {
        return skuImgInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SkuImgInfos> list) {
        return skuImgInfosMapper.batchInsert(list);
    }

}
