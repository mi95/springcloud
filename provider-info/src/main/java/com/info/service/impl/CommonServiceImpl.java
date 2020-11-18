package com.info.service.impl;

import com.common.pojo.RespBean;
import com.info.service.CommonService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author xiaomi
 * @create 2020/11/2
 **/
@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public RespBean uploadImg(MultipartFile file) throws IOException {
//        //        获取文件名
//        String fileName = file.getOriginalFilename();
//        //获取文件后缀名
//        String suffixName = fileName.substring(fileName.lastIndexOf("."));
//        //重新生成文件名
//        fileName = IDUtils.getUUid() + suffixName;
//
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
//        String format = simpleDateFormat.format(date);
//
//        String url = "https://" + buckeName + "." + endpoint + "/" + sys + format + "/" + fileName;
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("attId", pubAttService.insertPubAtt(url));
//        map.put("url", url);
        return RespBean.success();
    }
}
