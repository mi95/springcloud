package com.shop.pojo.generate;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sku信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkuInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * sku名称
     */
    private String name;

    /**
     * 库存数量
     */
    private Integer stockNum;

    private static final long serialVersionUID = 1L;
}