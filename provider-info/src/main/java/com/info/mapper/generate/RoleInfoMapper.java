package com.info.mapper.generate;

import com.info.pojo.generate.RoleInfo;
import com.info.pojo.generate.RoleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface RoleInfoMapper {
    long countByExample(RoleInfoExample example);

    int deleteByExample(RoleInfoExample example);

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
    int insert(RoleInfo record);

    int insertOrUpdate(RoleInfo record);

    int insertOrUpdateSelective(RoleInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(RoleInfo record);

    List<RoleInfo> selectByExample(RoleInfoExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    RoleInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(RoleInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(RoleInfo record);

    int updateBatch(List<RoleInfo> list);

    int batchInsert(@Param("list") List<RoleInfo> list);
}