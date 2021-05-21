package com.supriya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supriya.model.Product;
import com.supriya.repository.IProductRepository;
import com.supriya.request.ProductRequestBean;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;

	@Override
	public String addProduct(ProductRequestBean product) {

		Product pr = new Product();
		pr.setBrand(product.getBrand());
		pr.setDescription(product.getDescription());
		pr.setProductCode(product.getProductCode());
		pr.setProductCompanyAddress(product.getProductCompanyAddress());
		pr.setProductCompanyName(product.getProductCompanyName());
		pr.setProductName(product.getProductName());
		productRepository.save(pr);
		return "Successfully added";
	}

	@Override
	public Iterable<Product> getAllProductList() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductByName(String name) {
		return productRepository.findByProductName(name);
	}

	@Override
	public Product getProductByCode(String productCode) {
		return productRepository.findByProductCode(productCode);
	}

}
