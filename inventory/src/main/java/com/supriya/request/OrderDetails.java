package com.supriya.request;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDetails {

	private Long orderId;
	
	private Long createdBy;
	
	private Long updatedBy;

	private Date createdAt;

	private Date updatedAt;

	private Long orderNumber;
	
	private UserDetails userName;
	
	
	private List<ProductRequestBean> product;
	
	private Long itemQuantity;

	private Double price;
	
	private String discountPrc; 
	
	private Double totalPrice;
	
	private Date serviceDateFirst;
	
	private Date serviceDateSecond;
	
	private Date serviceDateThird;
	
	private Date serviceDateFourth;
	
	private String serviceDateFifth;	

}
