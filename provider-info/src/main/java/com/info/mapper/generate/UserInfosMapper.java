package com.info.mapper.generate;

import com.info.pojo.generate.UserInfos;
import com.info.pojo.generate.UserInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface UserInfosMapper {
    long countByExample(UserInfosExample example);

    int deleteByExample(UserInfosExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserInfos record);

    int insertOrUpdate(UserInfos record);

    int insertOrUpdateSelective(UserInfos record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserInfos record);

    List<UserInfos> selectByExample(UserInfosExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UserInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfos record, @Param("example") UserInfosExample example);

    int updateByExample(@Param("record") UserInfos record, @Param("example") UserInfosExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserInfos record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserInfos record);

    int updateBatch(List<UserInfos> list);

    int batchInsert(@Param("list") List<UserInfos> list);
}