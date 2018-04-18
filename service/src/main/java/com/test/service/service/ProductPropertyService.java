package com.test.service.service;


import com.test.service.model.ProductProperty;

public interface ProductPropertyService {
	
	public void add(ProductProperty productProperty);
	
	public void update(ProductProperty productProperty);
	
	public void delete(Long id);
	
	public ProductProperty findById(Long id);
	
}
