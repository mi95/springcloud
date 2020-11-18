package com.info.mapper.generate;

import com.info.pojo.generate.ProvinceInfo;
import com.info.pojo.generate.ProvinceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface ProvinceInfoMapper {
    long countByExample(ProvinceInfoExample example);

    int deleteByExample(ProvinceInfoExample example);

    /**
     * delete by primary key
     * @param provinceId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer provinceId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ProvinceInfo record);

    int insertOrUpdate(ProvinceInfo record);

    int insertOrUpdateSelective(ProvinceInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ProvinceInfo record);

    List<ProvinceInfo> selectByExample(ProvinceInfoExample example);

    /**
     * select by primary key
     * @param provinceId primary key
     * @return object by primary key
     */
    ProvinceInfo selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") ProvinceInfo record, @Param("example") ProvinceInfoExample example);

    int updateByExample(@Param("record") ProvinceInfo record, @Param("example") ProvinceInfoExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ProvinceInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ProvinceInfo record);

    int updateBatch(List<ProvinceInfo> list);

    int batchInsert(@Param("list") List<ProvinceInfo> list);
}