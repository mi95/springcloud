package com.info.controller;

import com.common.pojo.RespBean;
import com.info.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("common")
public class CommonController {
    @Autowired
    CommonService commonService;

    @PostMapping("uploadImg")
    public RespBean uploadImg(MultipartFile file) {
        if (file.isEmpty()) {
            return RespBean.fail("上传失败，请选择文件");
        }

        String fileName = file.getOriginalFilename();
        String filePath = "C:\\Users\\lh001\\Desktop\\test\\"+fileName;
        File dest = new File(filePath);
        try {
            file.transferTo(dest);
            return RespBean.success(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return RespBean.fail("上传失败");
    }


}
