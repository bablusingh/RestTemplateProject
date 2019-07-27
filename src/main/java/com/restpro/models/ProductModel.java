package com.restpro.models;

import lombok.Data;

@Data
public class ProductModel {

	public ProductModel() {
	}

	public ProductModel(long id, String proName, String proPrice, String proDescription, String proQuantity,
			String proSize) {

		this.id = id;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proDescription = proDescription;
		this.proQuantity = proQuantity;
		this.proSize = proSize;

	}

	private long id;
	private String proName;
	private String proPrice;
	private String proDescription;
	private String proQuantity;
	private String proSize;

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", proName=" + proName + ", proPrice=" + proPrice + ", proDescription="
				+ proDescription + ", proQuantity=" + proQuantity + ", proSize=" + proSize + "]";
	}

}
