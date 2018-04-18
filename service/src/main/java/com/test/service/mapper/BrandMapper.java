package com.test.service.mapper;

import com.test.service.model.Brand;
import org.apache.ibatis.annotations.*;


@Mapper
public interface BrandMapper {
	
	@Insert("INSERT INTO brand(name,description) VALUES(#{name},#{description})")  
	void add(Brand brand);
	
	@Update("UPDATE brand SET name=#{name},description=#{description} WHERE id=#{id}")  
	void update(Brand brand);
	
	@Delete("DELETE FROM brand WHERE id=#{id}")  
	void delete(Long id);
	
	@Select("SELECT * FROM brand WHERE id=#{id}")
	Brand findById(Long id);
	
}
