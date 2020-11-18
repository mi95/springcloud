package com.info.service;

import com.common.pojo.RespBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author xiaomi
 * @create 2020/11/2
 **/
public interface CommonService {
    //上传图片
    RespBean uploadImg(MultipartFile file) throws IOException;
}
