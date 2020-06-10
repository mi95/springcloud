package com.shop.service.impl;

import com.common.utils.CommonException;
import com.common.utils.ParamVerifyUtil;
import com.shop.mapper.generate.SpuInfosMapper;
import com.shop.pojo.generate.SpuInfos;
import com.shop.pojo.generate.SpuInfosExample;
import com.shop.service.SpuService;
import com.shop.utils.GlobalShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    private SpuInfosMapper spuInfosMapper;

    /**
     * 添加spu
     *
     * @param spuInfos
     */
    @Override
    public void addSpu(SpuInfos spuInfos) {
        ParamVerifyUtil.verifyT(spuInfos,spuInfos.getName());
        CommonException.operResultInteger(spuInfosMapper.insertSelective(spuInfos));
    }

    /**
     * 编辑spu
     *
     * @param spuInfos
     */
    @Override
    public void updSpu(SpuInfos spuInfos) {
        ParamVerifyUtil.verifyT(spuInfos,spuInfos.getId());
        CommonException.operResultInteger(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));
    }

    /**
     * 下架
     *
     * @param id
     */
    @Override
    public void upFrameSpu(Integer id) {
        ParamVerifyUtil.verifyT(id);
        SpuInfos spuInfos = new SpuInfos();
        spuInfos.setId(id);
        spuInfos.setStatus(GlobalShop.SPU_STATUS_UP);
        CommonException.operResultInteger(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));
    }

    /**
     * 下架
     *
     * @param id
     */
    @Override
    public void downFrameSpu(Integer id) {
        ParamVerifyUtil.verifyT(id);
        SpuInfos spuInfos = new SpuInfos();
        spuInfos.setId(id);
        spuInfos.setStatus(GlobalShop.SPU_STATUS_DOWN);
        CommonException.operResultInteger(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));
    }

    /**
     * 删除spu
     *
     * @param id
     */
    @Override
    public void delSpu(Integer id) {
        ParamVerifyUtil.verifyT(id);
        CommonException.operResultInteger(spuInfosMapper.deleteByPrimaryKey(id));
    }

    /**
     * 获取spu分页列表
     *
     * @return
     */
    @Override
    public List<SpuInfos> selectAllSpu() {
        SpuInfosExample example = new SpuInfosExample();
        return spuInfosMapper.selectByExample(example);
    }
}




