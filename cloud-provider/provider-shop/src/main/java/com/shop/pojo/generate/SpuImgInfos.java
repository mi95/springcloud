package com.shop.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * spu图片信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuImgInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * spu编号
     */
    private Integer spuId;

    /**
     * url
     */
    private String url;

    private static final long serialVersionUID = 1L;
}