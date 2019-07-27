package com.restpro.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import com.restpro.entities.Product;
import com.restpro.models.ProductModel;
import com.restpro.models.ProductResponseModel;
import com.restpro.models.ResponseData;
import com.restpro.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepositoryImpl;

	@Autowired
	private Converter<ProductModel, Product> productConverter;

	@Autowired
	private Converter<Product, ProductModel> productConverterShowAll;

	@Override
	public ResponseData addProduct(ProductModel productModel) {
		// TODO Auto-generated method stub
		Product product = (Product) productConverter.convert(productModel);
		long i = productRepositoryImpl.addProduct(product).getId();
		if (i > 0) {
			return new ResponseData(product.getId(), true, "Save Data Success full");
		} else {
			return new ResponseData(0, false, "Failed");
		}

	}

	@Override
	public ProductModel getSingleProduct(long id) {
		// TODO Auto-generated method stub
		// productRepositoryImpl.getSingleProduct(id);
		return productConverterShowAll.convert(productRepositoryImpl.getSingleProduct(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProductResponseModel getAllProduct() {
		// TODO Auto-generated method stub

		ProductResponseModel productResponseModel = new ProductResponseModel();

		Map<String, Object> map = productRepositoryImpl.getAllProduct();

		// productResponseModel.setCount((long) map.get("count"));
		List<Product> product = (List<Product>) map.get("data");
		List<ProductModel> productList = product.stream().map(p -> new ProductModel(p.getId(), p.getProName(),
				p.getProPrice(), p.getProQuantity(), p.getProDescription(), p.getProSize()))
				.collect(Collectors.toList());

		productResponseModel.setData(productList);

		return productResponseModel;
	}

}
