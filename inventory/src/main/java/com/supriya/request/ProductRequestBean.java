package com.supriya.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductRequestBean {
	private Long id;

	private String productCode;

	private String productName;

	private String description;

	private String brand;

	private String productCompanyName;

	private String productCompanyAddress;
	
	private Double mrp;
}
