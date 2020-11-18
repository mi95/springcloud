package com.shop.service.impl;

import com.common.utils.CommonException;
import com.shop.mapper.generate.SpuInfosMapper;
import com.shop.pojo.SpuInfosBo;
import com.shop.pojo.generate.SpuInfos;
import com.shop.pojo.generate.SpuInfosExample;
import com.shop.service.EsRepository;
import com.shop.service.SpuService;
import com.shop.utils.GlobalShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    SpuInfosMapper spuInfosMapper;

    @Autowired
    EsRepository esRepository;

    @Autowired
    private ElasticsearchRestTemplate esTemplate;

    private Pageable pageable = PageRequest.of(0, 10);

    /**
     * 添加spu
     *
     * @param spuInfos
     */
    @Override
    public void addSpu(SpuInfos spuInfos) {
        CommonException.verifyObjects(spuInfos, spuInfos.getName());
        CommonException.opeResult(spuInfosMapper.insertSelective(spuInfos));
    }

    /**
     * 编辑spu
     *
     * @param spuInfos
     */
    @Override
    public void updSpu(SpuInfos spuInfos) {
        CommonException.verifyObjects(spuInfos, spuInfos.getId());
        CommonException.opeResult(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));
    }

    /**
     * 上架
     *
     * @param id
     */
    @Override
    public void upFrameSpu(Integer id) {
        CommonException.verifyObjects(id);
        SpuInfos spuInfos = new SpuInfos();
        spuInfos.setId(id);
        spuInfos.setStatus(GlobalShop.SPU_STATUS_UP);
        CommonException.opeResult(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));

        SpuInfosBo spuInfosBo = new SpuInfosBo();
        spuInfosBo.setId(1);
        spuInfosBo.setStatus(1);
        spuInfosBo.setName("abc123.,*_");
        esSave(spuInfosBo);
    }

    /**
     * 下架
     *
     * @param id
     */
    @Override
    public void downFrameSpu(Integer id) {
        CommonException.verifyObjects(id);
        SpuInfos spuInfos = new SpuInfos();
        spuInfos.setId(id);
        spuInfos.setStatus(GlobalShop.SPU_STATUS_DOWN);
        CommonException.opeResult(spuInfosMapper.updateByPrimaryKeySelective(spuInfos));
    }

    /**
     * 删除spu
     *
     * @param id
     */
    @Override
    public void delSpu(Integer id) {
        CommonException.verifyObjects(id);
        CommonException.opeResult(spuInfosMapper.deleteByPrimaryKey(id));
    }

    /**
     * 获取spu分页列表
     *
     * @return
     */
    @Override
    public List<SpuInfos> findAllSpu() {
        SpuInfosExample example = new SpuInfosExample();
        return spuInfosMapper.selectByExample(example);
    }

    @Override
    public SpuInfos findSpuById(Integer id) {
        CommonException.verifyObjects(id);
        return spuInfosMapper.selectByPrimaryKey(id);
    }

    private void esSave(SpuInfosBo infos) {
        if (infos != null) {
//            esTemplate.createIndex("idx_spu_infos");
            esRepository.save(infos);
        }
    }

    @Override
    public Page<SpuInfosBo> findSpuFromEs(String key) {
        return esRepository.findByName(key, pageable);
    }
}




