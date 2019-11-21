package com.example.icecreamup.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.icecreamup.dto.ProductDTO;
/**
 * Repository for Orders, uses CrudRepository
 * 
 */
public interface ProductRepository extends CrudRepository<ProductDTO, Integer> {

}
