package com.test.service.service.impl;

import com.test.service.mapper.CategoryMapper;
import com.test.service.model.Category;
import com.test.service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	public void add(Category category) {
		categoryMapper.add(category); 
	}

	public void update(Category category) {
		categoryMapper.update(category); 
	}

	public void delete(Long id) {
		categoryMapper.delete(id); 
	}

	public Category findById(Long id) {
		return categoryMapper.findById(id);
	}

}
