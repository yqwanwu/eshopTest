package com.test.service.service;


import com.test.service.model.Product;

public interface ProductService {
	
	public void add(Product product);
	
	public void update(Product product);
	
	public void delete(Long id);
	
	public Product findById(Long id);
	
}
