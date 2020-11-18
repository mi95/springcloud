package com.info.mapper.generate;

import com.info.pojo.generate.AuthInfo;
import com.info.pojo.generate.AuthInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaomi
 * @create 2020/11/17
 **/
@Mapper
public interface AuthInfoMapper {
    long countByExample(AuthInfoExample example);

    int deleteByExample(AuthInfoExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(AuthInfo record);

    int insertOrUpdate(AuthInfo record);

    int insertOrUpdateSelective(AuthInfo record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AuthInfo record);

    List<AuthInfo> selectByExample(AuthInfoExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AuthInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthInfo record, @Param("example") AuthInfoExample example);

    int updateByExample(@Param("record") AuthInfo record, @Param("example") AuthInfoExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AuthInfo record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AuthInfo record);

    int updateBatch(List<AuthInfo> list);

    int batchInsert(@Param("list") List<AuthInfo> list);
}