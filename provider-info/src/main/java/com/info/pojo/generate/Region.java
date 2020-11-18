package com.info.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region implements Serializable {
    /**
    * 区域主键
    */
    private Integer id;

    /**
    * 区域名称
    */
    private String name;

    /**
    * 区域上级标识
    */
    private Integer pid;

    /**
    * 地名简称
    */
    private String sname;

    /**
    * 区域等级
    */
    private Integer level;

    /**
    * 区域编码
    */
    private String citycode;

    /**
    * 邮政编码
    */
    private String yzcode;

    /**
    * 组合名称
    */
    private String mername;

    private Double lng;

    private Double lat;

    private String pinyin;

    private static final long serialVersionUID = 1L;
}