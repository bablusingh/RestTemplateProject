package com.restpro.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String proName;
	private String proPrice;
	private String proDescription;
	private String proQuantity;
	private String proSize;
	
	

}
