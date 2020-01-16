package com.johnabbott.msn.dao;

import java.util.List;

import com.johnabbott.msn.model.Product;

public interface ProductDao {
	public int insertProduct(Product prd);
	
	public List<Product> getProducts();
	
	public List<Product> getShippedProducts();
	
	public Product getProductById(int productId);
	
	public boolean updateProduct(Product prd);
	
	public boolean deleteProduct(int productId);
}
