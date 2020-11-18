package com.shop.pojo.generate;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 属性值表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttrValueInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 属性编号
     */
    private Integer attrId;

    /**
     * 属性值
     */
    private String name;

    private static final long serialVersionUID = 1L;
}