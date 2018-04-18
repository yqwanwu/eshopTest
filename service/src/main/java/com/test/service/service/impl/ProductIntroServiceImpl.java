package com.test.service.service.impl;

import com.test.service.mapper.ProductIntroMapper;
import com.test.service.model.ProductIntro;
import com.test.service.service.ProductIntroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductIntroServiceImpl implements ProductIntroService {

	@Autowired
	private ProductIntroMapper productIntroMapper;
	
	public void add(ProductIntro productIntro) {
		productIntroMapper.add(productIntro); 
	}

	public void update(ProductIntro productIntro) {
		productIntroMapper.update(productIntro); 
	}

	public void delete(Long id) {
		productIntroMapper.delete(id); 
	}

	public ProductIntro findById(Long id) {
		return productIntroMapper.findById(id);
	}

}
