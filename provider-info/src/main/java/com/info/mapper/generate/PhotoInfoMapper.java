package com.info.mapper.generate;

import com.info.pojo.generate.PhotoInfo;
import com.info.pojo.generate.PhotoInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaomi
 * @create 2020/11/19
 **/
@Mapper
public interface PhotoInfoMapper {
    long countByExample(PhotoInfoExample example);

    int deleteByExample(PhotoInfoExample example);

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
    int insert(PhotoInfo record);

    int insertOrUpdate(PhotoInfo record);

    int insertOrUpdateSelective(PhotoInfo record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PhotoInfo record);

    List<PhotoInfo> selectByExample(PhotoInfoExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PhotoInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    int updateByExample(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PhotoInfo record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PhotoInfo record);

    int updateBatch(List<PhotoInfo> list);

    int batchInsert(@Param("list") List<PhotoInfo> list);
}