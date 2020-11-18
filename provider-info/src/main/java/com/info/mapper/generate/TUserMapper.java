package com.info.mapper.generate;

import com.info.pojo.generate.TUser;
import com.info.pojo.generate.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    /**
     * delete by primary key
     * @param fdId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String fdId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TUser record);

    int insertOrUpdate(TUser record);

    int insertOrUpdateSelective(TUser record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    /**
     * select by primary key
     * @param fdId primary key
     * @return object by primary key
     */
    TUser selectByPrimaryKey(String fdId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUser record);

    int updateBatch(List<TUser> list);

    int batchInsert(@Param("list") List<TUser> list);
}