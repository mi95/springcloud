package com.shop.pojo.generate;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfos implements Serializable {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人编号
     */
    private Integer createId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人编号
     */
    private Integer updateId;

    private static final long serialVersionUID = 1L;
}