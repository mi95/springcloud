package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.shop.mapper.generate.AttrValueInfosMapper;
import java.util.List;
import com.shop.pojo.generate.AttrValueInfos;
import com.shop.pojo.generate.AttrValueInfosExample;
import com.shop.service.AttrValueInfosService;
@Service
public class AttrValueInfosServiceImpl implements AttrValueInfosService{

    @Resource
    private AttrValueInfosMapper attrValueInfosMapper;

    @Override
    public long countByExample(AttrValueInfosExample example) {
        return attrValueInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AttrValueInfosExample example) {
        return attrValueInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return attrValueInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AttrValueInfos record) {
        return attrValueInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AttrValueInfos record) {
        return attrValueInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AttrValueInfos record) {
        return attrValueInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AttrValueInfos record) {
        return attrValueInfosMapper.insertSelective(record);
    }

    @Override
    public List<AttrValueInfos> selectByExample(AttrValueInfosExample example) {
        return attrValueInfosMapper.selectByExample(example);
    }

    @Override
    public AttrValueInfos selectByPrimaryKey(Integer id) {
        return attrValueInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AttrValueInfos record,AttrValueInfosExample example) {
        return attrValueInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AttrValueInfos record,AttrValueInfosExample example) {
        return attrValueInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(AttrValueInfos record) {
        return attrValueInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AttrValueInfos record) {
        return attrValueInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AttrValueInfos> list) {
        return attrValueInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AttrValueInfos> list) {
        return attrValueInfosMapper.batchInsert(list);
    }

}
