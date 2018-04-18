package com.test.service.service.impl;

import com.test.service.mapper.BrandMapper;
import com.test.service.model.Brand;
import com.test.service.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandMapper brandMapper;
	
	public void add(Brand brand) {
		brandMapper.add(brand); 
	}

	public void update(Brand brand) {
		brandMapper.update(brand); 
	}

	public void delete(Long id) {
		brandMapper.delete(id); 
	}

	public Brand findById(Long id) {
		return brandMapper.findById(id);
	}

}
