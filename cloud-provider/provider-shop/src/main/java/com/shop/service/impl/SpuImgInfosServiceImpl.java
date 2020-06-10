package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.shop.pojo.generate.SpuImgInfos;
import com.shop.mapper.generate.SpuImgInfosMapper;
import com.shop.pojo.generate.SpuImgInfosExample;
import com.shop.service.SpuImgInfosService;
@Service
public class SpuImgInfosServiceImpl implements SpuImgInfosService{

    @Resource
    private SpuImgInfosMapper spuImgInfosMapper;

    @Override
    public long countByExample(SpuImgInfosExample example) {
        return spuImgInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SpuImgInfosExample example) {
        return spuImgInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return spuImgInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SpuImgInfos record) {
        return spuImgInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(SpuImgInfos record) {
        return spuImgInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SpuImgInfos record) {
        return spuImgInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(SpuImgInfos record) {
        return spuImgInfosMapper.insertSelective(record);
    }

    @Override
    public List<SpuImgInfos> selectByExample(SpuImgInfosExample example) {
        return spuImgInfosMapper.selectByExample(example);
    }

    @Override
    public SpuImgInfos selectByPrimaryKey(Integer id) {
        return spuImgInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SpuImgInfos record,SpuImgInfosExample example) {
        return spuImgInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SpuImgInfos record,SpuImgInfosExample example) {
        return spuImgInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SpuImgInfos record) {
        return spuImgInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpuImgInfos record) {
        return spuImgInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SpuImgInfos> list) {
        return spuImgInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<SpuImgInfos> list) {
        return spuImgInfosMapper.batchInsert(list);
    }

}
