package com.shop.controller;

import com.common.pojo.RespBean;
import com.shop.pojo.ParaBean;
import com.shop.pojo.generate.SpuInfos;
import com.shop.service.SpuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("spu管理")
@RequestMapping("spu")
@RestController
public class SpuController {
    @Autowired
    SpuService spuService;

    private static int UPD_SPU_TYPE_UP = 1;
    private static int UPD_SPU_TYPE_DOWN = 2;

    @ApiOperation("添加spu")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "string"),
            @ApiImplicitParam(name = "status", value = "状态", dataType = "int")
    })
    @PostMapping("/")
    RespBean addSpu(@RequestBody SpuInfos spuInfos) {
        spuService.addSpu(spuInfos);
        return RespBean.success();
    }

    /**
     * 编辑spu
     *
     * @param spuInfos
     */
    @PutMapping("/")
    RespBean updSpu(@RequestBody SpuInfos spuInfos) {
        spuService.updSpu(spuInfos);
        return RespBean.success();
    }

    /**
     * 上下架
     */
    @PatchMapping("/")
    RespBean upFrameSpu(@RequestBody ParaBean paramBody) {
        if (paramBody.getType() == UPD_SPU_TYPE_UP) {
            spuService.upFrameSpu(paramBody.getId());
        } else {
            spuService.downFrameSpu(paramBody.getId());
        }
        return RespBean.success();
    }

    /**
     * 删除spu
     *
     * @param id
     */
    @DeleteMapping("/{id}")
    RespBean delSpu(@PathVariable Integer id) {
        spuService.delSpu(id);
        return RespBean.success();
    }

    @ApiOperation("获取spu分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "关键字", dataType = "string"),
            @ApiImplicitParam(name = "status", value = "状态", dataType = "int")
    })
    @GetMapping("/")
    RespBean selectAllSpu() {
        return RespBean.success(spuService.findAllSpu());
    }

    @GetMapping("esSpu")
    RespBean findSpuFromEs(@RequestBody String name) {
        return RespBean.success(spuService.findSpuFromEs(name));
    }
}
