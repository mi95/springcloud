package com.info.service.impl;

import com.common.pojo.RespBean;
import com.info.mapper.generate.PhotoInfoMapper;
import com.info.pojo.generate.PhotoInfo;
import com.info.pojo.generate.PhotoInfoExample;
import com.info.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaomi
 * @create 2020/11/3
 **/
@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    PhotoInfoMapper photoInfoMapper;

    @Override
    public Integer selectNo() {
        PhotoInfoExample photoInfoExample = new PhotoInfoExample();
        photoInfoExample.setOrderByClause("id desc limit 1");
        List<PhotoInfo> photoInfos = photoInfoMapper.selectByExample(photoInfoExample);
        if(photoInfos == null || photoInfos.size() == 0){
            return 0;
        }
        return photoInfos.get(0).getId();
    }

    @Override
    public RespBean select() {
        PhotoInfoExample photoInfoExample = new PhotoInfoExample();
        photoInfoExample.createCriteria().andStatusEqualTo(1);
        photoInfoExample.setOrderByClause("id asc");
        List<PhotoInfo> infos = photoInfoMapper.selectByExample(photoInfoExample);
        List<Map> datas = new ArrayList<>();
        Map data = new HashMap();
        for(int i=0; i<infos.size(); i++){
            if(i%2 != 0){
                data.put("urlB",infos.get(i).getUrl());
                datas.add(data);
                data = new HashMap();
            }else{
                data.put("urlA",infos.get(i).getUrl());
            }
        }
        if(infos.size() % 2 != 0){
            datas.add(data);
        }
        return RespBean.success(datas);
    }

    @Override
    public RespBean selectPage() {
        return null;
    }

    @Override
    public RespBean add(List<PhotoInfo> photoInfos) {
        return RespBean.success(photoInfoMapper.batchInsert(photoInfos));
    }

    @Override
    public RespBean update(PhotoInfo photoInfo) {
        if(photoInfo.getId() == null){
            PhotoInfo info = new PhotoInfo();
            info.setStatus(2);
            photoInfoMapper.updateByExampleSelective(info,null);
        }
        return RespBean.success(photoInfoMapper.updateByPrimaryKeySelective(photoInfo));
    }

    @Override
    public RespBean delete(Integer id) {
        if(id == null || id <= 0){
            return RespBean.success(photoInfoMapper.deleteByExample(null));
        }
        return RespBean.success(photoInfoMapper.deleteByPrimaryKey(id));
    }
}
