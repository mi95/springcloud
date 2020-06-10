package com.shop.controller;

import com.common.pojo.RespBean;
import com.shop.pojo.generate.SpuInfos;
import com.shop.service.SearchService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("商品搜索管理")
@RequestMapping("search")
@RestController
public class SearchController {
    @Autowired
    SearchService searchService;

    @PostMapping("data")
    public RespBean saveEsData(@RequestBody SpuInfos spuInfos){
        return searchService.saveEsData(spuInfos);
    }

    @GetMapping("data")
    public RespBean findAllEsData(){
        return searchService.findEsDataNoPage();
    }
}
