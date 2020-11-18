package com.shop.pojo.generate;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * spu信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * spu名称
     */
    private String name;

    /**
     * 状态 1-未上架 2-已上架
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}