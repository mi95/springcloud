package com.shop.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sku关联sku信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuSkuInfos implements Serializable {
    /**
     * spu编号
     */
    private Integer spuId;

    /**
     * sku编号
     */
    private Integer skuId;

    private static final long serialVersionUID = 1L;
}