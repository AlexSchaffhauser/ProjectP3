package com.johnabbott.msn.service;

import java.util.List;

import com.johnabbott.msn.model.Product;

public interface ProductService {

	public boolean addProduct(Product prd);
	
	public boolean deleteProduct(int productId);
	
	public boolean updateProduct(Product prd);
	
	public List<Product> getProducts();
	
	public List<Product> getShippedProducts();
	
	public Product getProductById(int productId);
}
