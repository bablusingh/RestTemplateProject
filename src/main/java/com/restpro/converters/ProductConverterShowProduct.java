package com.restpro.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.restpro.entities.Product;
import com.restpro.models.ProductModel;

@Component("productConverterShowProduct")
public class ProductConverterShowProduct implements Converter<Product, ProductModel> {

	@Override
	public ProductModel convert(Product product) {
		// TODO Auto-generated method stub
		ProductModel proModel=new ProductModel();
		proModel.setId(product.getId());
		proModel.setProName(product.getProName());
		proModel.setProPrice(product.getProPrice());
		proModel.setProQuantity(product.getProQuantity());
		proModel.setProSize(product.getProSize());
		proModel.setProDescription(product.getProDescription());
		
		
		
		return proModel;
	}

	

}
