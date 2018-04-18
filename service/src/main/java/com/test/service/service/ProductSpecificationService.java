package com.test.service.service;


import com.test.service.model.ProductSpecification;

public interface ProductSpecificationService {
	
	public void add(ProductSpecification productSpecification);
	
	public void update(ProductSpecification productSpecification);
	
	public void delete(Long id);
	
	public ProductSpecification findById(Long id);
	
}
