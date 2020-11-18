package com.shop.pojo.generate;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单详情
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单编号
     */
    private Integer orderId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 商品数量
     */
    private String num;

    private static final long serialVersionUID = 1L;
}