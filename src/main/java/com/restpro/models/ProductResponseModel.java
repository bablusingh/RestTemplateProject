package com.restpro.models;

import java.util.List;

import lombok.Data;

@Data
public class ProductResponseModel {

	private long count;
	private List<ProductModel> data;
	//private long id;

}
