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
/**
    * 相册
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoInfo implements Serializable {
    private Integer id;

    /**
    * 顺序
    */
    private Integer sort;

    /**
    * 图片路径
    */
    private String url;

    /**
    * 1-正常 2-删除
    */
    private Integer status;

    private static final long serialVersionUID = 1L;
}