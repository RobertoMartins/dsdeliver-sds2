package com.semanadevsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semanadevsuperior.dsdeliver.dto.ProductDTO;
import com.semanadevsuperior.dsdeliver.entities.Product;
import com.semanadevsuperior.dsdeliver.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}
}
