package com.vochidai.WebTaxi.mapper;

import com.vochidai.WebTaxi.model.Category;
import com.vochidai.WebTaxi.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	long countByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int deleteByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int deleteByPrimaryKey(Byte categoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int insert(Category row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int insertSelective(Category row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	List<Category> selectByExample(CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	Category selectByPrimaryKey(Byte categoryId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByExampleSelective(@Param("row") Category row, @Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByExample(@Param("row") Category row, @Param("example") CategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByPrimaryKeySelective(Category row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbg.generated  Sat Jun 17 14:21:47 ICT 2023
	 */
	int updateByPrimaryKey(Category row);
}