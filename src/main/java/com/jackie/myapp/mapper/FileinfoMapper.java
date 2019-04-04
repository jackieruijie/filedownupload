package com.jackie.myapp.mapper;

import com.jackie.myapp.model.Fileinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    int insert(Fileinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    int insertSelective(Fileinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    Fileinfo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    int updateByPrimaryKeySelective(Fileinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fileinfo
     *
     * @mbg.generated Thu Mar 28 11:08:46 CST 2019
     */
    int updateByPrimaryKey(Fileinfo record);


    public List<Fileinfo> selectAll();
}