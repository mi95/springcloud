package com.shop.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 属性表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 品牌名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}