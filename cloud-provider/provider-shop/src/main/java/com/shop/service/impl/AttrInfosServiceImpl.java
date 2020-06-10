package com.shop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.shop.mapper.generate.AttrInfosMapper;
import com.shop.pojo.generate.AttrInfosExample;
import com.shop.pojo.generate.AttrInfos;
import com.shop.service.AttrInfosService;
@Service
public class AttrInfosServiceImpl implements AttrInfosService{

    @Resource
    private AttrInfosMapper attrInfosMapper;

    @Override
    public long countByExample(AttrInfosExample example) {
        return attrInfosMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AttrInfosExample example) {
        return attrInfosMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return attrInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AttrInfos record) {
        return attrInfosMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AttrInfos record) {
        return attrInfosMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AttrInfos record) {
        return attrInfosMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AttrInfos record) {
        return attrInfosMapper.insertSelective(record);
    }

    @Override
    public List<AttrInfos> selectByExample(AttrInfosExample example) {
        return attrInfosMapper.selectByExample(example);
    }

    @Override
    public AttrInfos selectByPrimaryKey(Integer id) {
        return attrInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AttrInfos record,AttrInfosExample example) {
        return attrInfosMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AttrInfos record,AttrInfosExample example) {
        return attrInfosMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(AttrInfos record) {
        return attrInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AttrInfos record) {
        return attrInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AttrInfos> list) {
        return attrInfosMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AttrInfos> list) {
        return attrInfosMapper.batchInsert(list);
    }

}
