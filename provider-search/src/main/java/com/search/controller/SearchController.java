package com.search.controller;

import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.search.pojo.UserInfosBo;
import com.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("search")
public class SearchController {
    @Autowired
    SearchService searchService;

    @GetMapping("user/{id}")
    public RespBean findById(@PathVariable Integer id){
        return searchService.findById(id);
    }

    @GetMapping("user")
    public RespBean findAllUser(@RequestBody ReqParam param){
        return searchService.findAllUser(param);
    }

    @GetMapping("userDiff")
    public RespBean findAllUserDiff(@RequestBody ReqParam param){
        return searchService.findAllUserDiff(param);
    }

    @PostMapping("userAll")
    public RespBean addUserAll(){
        return searchService.addUserAll();
    }

    @PostMapping("user")
    public RespBean addUser(@RequestBody UserInfosBo userInfosBo){
        return searchService.addUser(userInfosBo);
    }

//    @PostMapping("userAll")
//    public RespBean addAllUser(@RequestBody List<UserInfosBo> userInfosBoBos){
//        return searchService.addAllUser(userInfosBoBos);
//    }

    @DeleteMapping("user")
    public RespBean delUser(@RequestBody UserInfosBo userInfosBoBo){
        return searchService.delUser(userInfosBoBo);
    }

    @DeleteMapping("userAll")
    public RespBean delAllUser(@RequestBody List<Integer> ids){
        return searchService.delAllUser(ids);
    }

    @DeleteMapping("index")
    public RespBean delIndex(@RequestBody ReqParam param){
        return searchService.delIndex(param);
    }
}
