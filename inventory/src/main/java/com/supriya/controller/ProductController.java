package com.supriya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.supriya.model.Product;
import com.supriya.request.ProductRequestBean;
import com.supriya.service.IProductService;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/product")
@Api(value = "product details", tags = "All product details")
public class ProductController {

	@Autowired
	private IProductService productService;

	@PostMapping(path = "/add")
	public @ResponseBody String addProduct(@RequestBody ProductRequestBean product) {

		return productService.addProduct(product);
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Product> getAllProductList() {
		return productService.getAllProductList();
	}

	@GetMapping(path = "/productName")
	public @ResponseBody Product getProductByName(@RequestParam(name ="productName") String productName) {
		return  productService.getProductByName(productName);
	}
	
	
	@GetMapping(path = "/productCode")
	public @ResponseBody Product getProductByCode(@RequestParam( name = "productCode")  String productCode) {
		return  productService.getProductByCode(productCode);
	}

}
