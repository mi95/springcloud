package com.info.pojo.generate;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
/**
    * 街道设置
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StreetInfo implements Serializable {
    /**
    * 自增列
    */
    private Integer streetId;

    /**
    * 街道代码
    */
    private String streetCode;

    /**
    * 父级区代码
    */
    private String areaCode;

    /**
    * 街道名称
    */
    private String streetName;

    /**
    * 简称
    */
    private String shortName;

    /**
    * 经度
    */
    private String lng;

    /**
    * 纬度
    */
    private String lat;

    /**
    * 排序
    */
    private Integer sort;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;

    /**
    * 备注
    */
    private String memo;

    /**
    * 状态
    */
    private Integer dataState;

    /**
    * 租户id
    */
    private String tenantCode;

    private static final long serialVersionUID = 1L;
}