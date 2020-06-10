package com.shop.mapper.generate;

import com.shop.pojo.generate.BrandInfos;
import com.shop.pojo.generate.BrandInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BrandInfosMapper {
    long countByExample(BrandInfosExample example);

    int deleteByExample(BrandInfosExample example);

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
    int insert(BrandInfos record);

    int insertOrUpdate(BrandInfos record);

    int insertOrUpdateSelective(BrandInfos record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(BrandInfos record);

    List<BrandInfos> selectByExample(BrandInfosExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    BrandInfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandInfos record, @Param("example") BrandInfosExample example);

    int updateByExample(@Param("record") BrandInfos record, @Param("example") BrandInfosExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BrandInfos record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BrandInfos record);

    int updateBatch(List<BrandInfos> list);

    int batchInsert(@Param("list") List<BrandInfos> list);

    int updateBatchSelective(List<BrandInfos> list);
}