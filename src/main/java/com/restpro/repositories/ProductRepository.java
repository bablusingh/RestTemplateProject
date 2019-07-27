package com.restpro.repositories;

import java.util.Map;

import com.restpro.entities.Product;

public interface ProductRepository {

	Product addProduct(Product product);

	Product getSingleProduct(long id);

	Map<String, Object> getAllProduct();

}
