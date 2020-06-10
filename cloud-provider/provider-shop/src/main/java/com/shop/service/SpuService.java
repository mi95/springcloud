package com.shop.service;

import com.shop.pojo.generate.SpuInfos;

import java.util.List;

public interface SpuService {
    /**
     * 添加spu
     * @param spuInfos
     */
    void addSpu(SpuInfos spuInfos);

    /**
     * 编辑spu
     * @param spuInfos
     */
    void updSpu(SpuInfos spuInfos);

    /**
     * 下架
     * @param id
     */
    void upFrameSpu(Integer id);

    /**
     * 下架
     * @param id
     */
    void downFrameSpu(Integer id);

    /**
     * 删除spu
     * @param id
     */
    void delSpu(Integer id);

    /**
     * 获取spu分页列表
     * @return
     */
    List<SpuInfos> selectAllSpu();

}






