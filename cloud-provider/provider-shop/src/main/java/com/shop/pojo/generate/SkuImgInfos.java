package com.shop.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sku图片信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkuImgInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * sku编号
     */
    private Integer skuId;

    /**
     * url
     */
    private String url;

    private static final long serialVersionUID = 1L;
}