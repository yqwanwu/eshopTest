package com.test.service.service;


import com.test.service.model.ProductIntro;

public interface ProductIntroService {
	
	public void add(ProductIntro productIntro);
	
	public void update(ProductIntro productIntro);
	
	public void delete(Long id);
	
	public ProductIntro findById(Long id);
	
}
