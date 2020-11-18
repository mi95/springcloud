package com.info.mapper.generate;

import com.info.pojo.generate.AreaInfo;
import com.info.pojo.generate.AreaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface AreaInfoMapper {
    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    /**
     * delete by primary key
     * @param areaId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer areaId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(AreaInfo record);

    int insertOrUpdate(AreaInfo record);

    int insertOrUpdateSelective(AreaInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    /**
     * select by primary key
     * @param areaId primary key
     * @return object by primary key
     */
    AreaInfo selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AreaInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AreaInfo record);

    int updateBatch(List<AreaInfo> list);

    int batchInsert(@Param("list") List<AreaInfo> list);
}