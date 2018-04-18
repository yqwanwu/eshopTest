package com.test.service.service.impl;

import com.test.service.mapper.ProductPropertyMapper;
import com.test.service.model.ProductProperty;
import com.test.service.service.ProductPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPropertyServiceImpl implements ProductPropertyService {

	@Autowired
	private ProductPropertyMapper productPropertyMapper;
	
	public void add(ProductProperty productProperty) {
		productPropertyMapper.add(productProperty); 
	}

	public void update(ProductProperty productProperty) {
		productPropertyMapper.update(productProperty); 
	}

	public void delete(Long id) {
		productPropertyMapper.delete(id); 
	}

	public ProductProperty findById(Long id) {
		return productPropertyMapper.findById(id);
	}

}
