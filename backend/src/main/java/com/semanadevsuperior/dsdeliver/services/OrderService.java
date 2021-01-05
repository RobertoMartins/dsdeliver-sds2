package com.semanadevsuperior.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semanadevsuperior.dsdeliver.dto.OrderDTO;
import com.semanadevsuperior.dsdeliver.dto.ProductDTO;
import com.semanadevsuperior.dsdeliver.entities.Order;
import com.semanadevsuperior.dsdeliver.entities.OrderStatus;
import com.semanadevsuperior.dsdeliver.entities.Product;
import com.semanadevsuperior.dsdeliver.repository.OrderRepository;
import com.semanadevsuperior.dsdeliver.repository.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
		
	}
	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null, dto.getAddress(),dto.getLatitude(),
				dto.getLongitude(),Instant.now(),OrderStatus.PENDING);
		for(ProductDTO p: dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		repository.save(order);
		return new OrderDTO(order);
	
	}
}
