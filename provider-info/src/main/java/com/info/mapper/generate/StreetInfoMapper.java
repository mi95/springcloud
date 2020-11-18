package com.info.mapper.generate;

import com.info.pojo.generate.StreetInfo;
import com.info.pojo.generate.StreetInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface StreetInfoMapper {
    long countByExample(StreetInfoExample example);

    int deleteByExample(StreetInfoExample example);

    /**
     * delete by primary key
     * @param streetId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer streetId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(StreetInfo record);

    int insertOrUpdate(StreetInfo record);

    int insertOrUpdateSelective(StreetInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(StreetInfo record);

    List<StreetInfo> selectByExample(StreetInfoExample example);

    /**
     * select by primary key
     * @param streetId primary key
     * @return object by primary key
     */
    StreetInfo selectByPrimaryKey(Integer streetId);

    int updateByExampleSelective(@Param("record") StreetInfo record, @Param("example") StreetInfoExample example);

    int updateByExample(@Param("record") StreetInfo record, @Param("example") StreetInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(StreetInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(StreetInfo record);

    int updateBatch(List<StreetInfo> list);

    int batchInsert(@Param("list") List<StreetInfo> list);
}