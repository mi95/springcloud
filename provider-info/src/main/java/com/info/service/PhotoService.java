package com.info.service;

import com.common.pojo.RespBean;
import com.info.pojo.generate.PhotoInfo;

import java.util.List;

/**
 * @author xiaomi
 * @create 2020/11/3
 **/
public interface PhotoService {
    Integer selectNo();

    RespBean select();

    RespBean selectPage();

    RespBean add(List<PhotoInfo> photoInfos);

    RespBean update(PhotoInfo photoInfo);

    RespBean delete(Integer id);
}
