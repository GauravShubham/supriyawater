package com.supriya.repository;

import org.springframework.data.repository.CrudRepository;

import com.supriya.model.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

	Product findByProductCode(String productCode);

	Product findByProductName(String name);

}
