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
    * 城市设置
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityInfo implements Serializable {
    /**
    * 自增列
    */
    private Integer cityId;

    /**
    * 市代码
    */
    private String cityCode;

    /**
    * 市名称
    */
    private String cityName;

    /**
    * 简称
    */
    private String shortName;

    /**
    * 省代码
    */
    private String provinceCode;

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