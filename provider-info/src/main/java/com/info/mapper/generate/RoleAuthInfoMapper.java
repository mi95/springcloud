package com.info.mapper.generate;

import com.info.pojo.generate.RoleAuthInfo;
import com.info.pojo.generate.RoleAuthInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface RoleAuthInfoMapper {
    long countByExample(RoleAuthInfoExample example);

    int deleteByExample(RoleAuthInfoExample example);

    /**
     * delete by primary key
     * @param roleId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("authId") Integer authId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(RoleAuthInfo record);

    int insertOrUpdate(RoleAuthInfo record);

    int insertOrUpdateSelective(RoleAuthInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(RoleAuthInfo record);

    List<RoleAuthInfo> selectByExample(RoleAuthInfoExample example);

    int updateByExampleSelective(@Param("record") RoleAuthInfo record, @Param("example") RoleAuthInfoExample example);

    int updateByExample(@Param("record") RoleAuthInfo record, @Param("example") RoleAuthInfoExample example);

    int updateBatch(List<RoleAuthInfo> list);

    int batchInsert(@Param("list") List<RoleAuthInfo> list);
}