package com.info.mapper.generate;

import com.info.pojo.generate.CityInfo;
import com.info.pojo.generate.CityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface CityInfoMapper {
    long countByExample(CityInfoExample example);

    int deleteByExample(CityInfoExample example);

    /**
     * delete by primary key
     * @param cityId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer cityId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CityInfo record);

    int insertOrUpdate(CityInfo record);

    int insertOrUpdateSelective(CityInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CityInfo record);

    List<CityInfo> selectByExample(CityInfoExample example);

    /**
     * select by primary key
     * @param cityId primary key
     * @return object by primary key
     */
    CityInfo selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    int updateByExample(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CityInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CityInfo record);

    int updateBatch(List<CityInfo> list);

    int batchInsert(@Param("list") List<CityInfo> list);
}