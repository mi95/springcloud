package com.info.mapper.generate;

import com.info.pojo.generate.RoleUserInfo;
import com.info.pojo.generate.RoleUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface RoleUserInfoMapper {
    long countByExample(RoleUserInfoExample example);

    int deleteByExample(RoleUserInfoExample example);

    /**
     * delete by primary key
     * @param roleId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("userId") Integer userId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(RoleUserInfo record);

    int insertOrUpdate(RoleUserInfo record);

    int insertOrUpdateSelective(RoleUserInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(RoleUserInfo record);

    List<RoleUserInfo> selectByExample(RoleUserInfoExample example);

    int updateByExampleSelective(@Param("record") RoleUserInfo record, @Param("example") RoleUserInfoExample example);

    int updateByExample(@Param("record") RoleUserInfo record, @Param("example") RoleUserInfoExample example);

    int updateBatch(List<RoleUserInfo> list);

    int batchInsert(@Param("list") List<RoleUserInfo> list);
}