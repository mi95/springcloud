package com.info.mapper.generate;

import com.info.pojo.generate.Region;
import com.info.pojo.generate.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
@Mapper
public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

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
    int insert(Region record);

    int insertOrUpdate(Region record);

    int insertOrUpdateSelective(Region record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Region selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Region record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Region record);

    int updateBatch(List<Region> list);

    int batchInsert(@Param("list") List<Region> list);
}