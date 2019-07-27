package com.restpro.services;

import com.restpro.models.ProductModel;
import com.restpro.models.ProductResponseModel;
import com.restpro.models.ResponseData;

public interface ProductService {

	ResponseData addProduct(ProductModel productModel);

	ProductModel getSingleProduct(long id);

	ProductResponseModel getAllProduct();

}
