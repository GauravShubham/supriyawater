package com.supriya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String productCode;

	private String productName;

	private String description;

	private String brand;
	
	private String productCompanyName;
	
	private String productCompanyAddress;
	
	private Double mrp;
	
	

}
