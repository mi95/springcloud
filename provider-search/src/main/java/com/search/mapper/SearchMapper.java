package com.search.mapper;

import com.search.pojo.UserInfosBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SearchMapper {
    @Select("select * from user_infos")
    List<UserInfosBo> findAllUser();

}
