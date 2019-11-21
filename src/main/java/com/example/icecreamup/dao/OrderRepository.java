package com.example.icecreamup.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.icecreamup.dto.OrderDTO;
/**
 * Repository for Orders, uses CrudRepository
 * 
 */
public interface OrderRepository extends CrudRepository<OrderDTO, Integer>
{

}
