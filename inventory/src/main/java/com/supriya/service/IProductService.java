package com.supriya.service;

import com.supriya.model.Product;
import com.supriya.request.ProductRequestBean;

public interface IProductService {

	public String addProduct(ProductRequestBean product);

	public Iterable<Product> getAllProductList();

	public Product getProductByName(String name);

	public Product getProductByCode(String productCode);

}
