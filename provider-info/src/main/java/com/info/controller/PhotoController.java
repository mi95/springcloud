package com.info.controller;

import com.common.pojo.RespBean;
import com.common.utils.CommonException;
import com.info.pojo.generate.PhotoInfo;
import com.info.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("photo")
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @Value("${httpUrl}")
    String url;

    @RequestMapping
    public String index(){
        return "upload";
    }

    @PostMapping("uploadImg")
    public String uploadImg(@RequestParam("file") MultipartFile[] files) {
        CommonException.verifyObjects(files);

        String path = "C:\\Users\\lh001\\Desktop\\test\\";
        String path1 = "/root/static/image/";
        List<PhotoInfo> photoInfos = new ArrayList<>();
        Integer num = photoService.selectNo();
        for(MultipartFile file : files){
            num += 1;
            PhotoInfo info = new PhotoInfo();
            info.setStatus(1);
            info.setSort(1);
            if (file.isEmpty()) {
                continue;
            }
            String fileName = num+".jpg";
            String filePath = path1+ fileName;
            File dest = new File(filePath);
            try {
                file.transferTo(dest);
                info.setUrl(url+"/"+fileName);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            photoInfos.add(info);
        }
        photoService.add(photoInfos);
        return "success";
    }

    @ResponseBody
    @RequestMapping("select")
    RespBean select(){
        return photoService.select();
    }

    @ResponseBody
    @RequestMapping("selectList")
    RespBean selectPage(){
        return RespBean.success();
    }

    @ResponseBody
    @RequestMapping("add")
    RespBean add(@RequestBody List<PhotoInfo> photoInfos){
        return photoService.add(photoInfos);
    }

    @ResponseBody
    @RequestMapping("update")
    RespBean update(@RequestBody  PhotoInfo photoInfo){
        return photoService.update(photoInfo);
    }

    @ResponseBody
    @RequestMapping("delete")
    RespBean delete(Integer id){
        return photoService.delete(id);
    }
}
