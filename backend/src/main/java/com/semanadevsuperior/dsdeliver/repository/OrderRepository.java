package com.semanadevsuperior.dsdeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semanadevsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
