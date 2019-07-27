package com.restpro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restpro.models.ProductModel;
import com.restpro.models.ProductResponseModel;
import com.restpro.models.ResponseData;
import com.restpro.services.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productServiceImpl;


	@PostMapping(value = "/addproducts",produces ="application/json")
	public ResponseData addProduct(@RequestBody ProductModel productModel) {
		return productServiceImpl.addProduct(productModel);

	}

	@GetMapping(value = "/getsingleproduct")
	public ProductModel getSingleProduct(@RequestParam("id") long id) {

		return productServiceImpl.getSingleProduct(id);

	}

	@GetMapping(value = "/getallproduct")
	public ProductResponseModel getAllProduct() {
		return productServiceImpl.getAllProduct();
	}

}
