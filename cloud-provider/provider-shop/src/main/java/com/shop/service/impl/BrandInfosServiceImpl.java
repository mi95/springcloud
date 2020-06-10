package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.shop.pojo.generate.BrandInfosExample;
import com.shop.pojo.generate.BrandInfos;
import com.shop.mapper.generate.BrandInfosMapper;
import com.shop.service.BrandInfosService;
@Service
public class BrandInfosServiceImpl implements BrandInfosService{

    @Resource
    private BrandInfosMapper brandInfosMapper;

    @Override
    public long countByExample(BrandInfosExample example) {
        return brandInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BrandInfosExample example) {
        return brandInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return brandInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BrandInfos record) {
        return brandInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BrandInfos record) {
        return brandInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BrandInfos record) {
        return brandInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BrandInfos record) {
        return brandInfosMapper.insertSelective(record);
    }

    @Override
    public List<BrandInfos> selectByExample(BrandInfosExample example) {
        return brandInfosMapper.selectByExample(example);
    }

    @Override
    public BrandInfos selectByPrimaryKey(Integer id) {
        return brandInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BrandInfos record,BrandInfosExample example) {
        return brandInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BrandInfos record,BrandInfosExample example) {
        return brandInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BrandInfos record) {
        return brandInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BrandInfos record) {
        return brandInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BrandInfos> list) {
        return brandInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<BrandInfos> list) {
        return brandInfosMapper.batchInsert(list);
    }

}
