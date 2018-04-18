package com.test.service.service.impl;

import com.test.service.mapper.ProductSpecificationMapper;
import com.test.service.model.ProductSpecification;
import com.test.service.service.ProductSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSpecificationServiceImpl implements ProductSpecificationService {

	@Autowired
	private ProductSpecificationMapper productSpecificationMapper;
	
	public void add(ProductSpecification productSpecification) {
		productSpecificationMapper.add(productSpecification); 
	}

	public void update(ProductSpecification productSpecification) {
		productSpecificationMapper.update(productSpecification); 
	}

	public void delete(Long id) {
		productSpecificationMapper.delete(id); 
	}

	public ProductSpecification findById(Long id) {
		return productSpecificationMapper.findById(id);
	}

}
