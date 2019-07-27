package com.restpro.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.restpro.entities.Product;
import com.restpro.models.ProductModel;

@Component("productConverter")
public class ProductConverter implements Converter<ProductModel, Product> {

	@Override
	public Product convert(ProductModel productModel) {
		// TODO Auto-generated method stub
		Product prod=new Product();
		prod.setId(productModel.getId());
		prod.setProName(productModel.getProName());
		prod.setProPrice(productModel.getProPrice());
		prod.setProQuantity(productModel.getProQuantity());
		prod.setProSize(productModel.getProSize());
		prod.setProDescription(productModel.getProDescription());
		
		
		return prod;
	}

}
