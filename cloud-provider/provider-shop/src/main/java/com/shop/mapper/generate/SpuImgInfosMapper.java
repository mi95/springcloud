package com.shop.mapper.generate;

import com.shop.pojo.generate.SpuImgInfos;
import com.shop.pojo.generate.SpuImgInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpuImgInfosMapper {
    long countByExample(SpuImgInfosExample example);

    int deleteByExample(SpuImgInfosExample example);

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
    int insert(SpuImgInfos record);

    int insertOrUpdate(SpuImgInfos record);

    int insertOrUpdateSelective(SpuImgInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SpuImgInfos record);

    List<SpuImgInfos> selectByExample(SpuImgInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SpuImgInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpuImgInfos record, @Param("example") SpuImgInfosExample example);

    int updateByExample(@Param("record") SpuImgInfos record, @Param("example") SpuImgInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SpuImgInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SpuImgInfos record);

    int updateBatch(List<SpuImgInfos> list);

    int batchInsert(@Param("list") List<SpuImgInfos> list);

    int updateBatchSelective(List<SpuImgInfos> list);
}