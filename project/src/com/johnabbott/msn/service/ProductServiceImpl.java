package com.johnabbott.msn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.msn.dao.ProductDao;
import com.johnabbott.msn.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public boolean addProduct(Product prd) {
		return productDao.insertProduct(prd) > 0 ;
	}

	@Override
	public boolean deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	@Override
	public boolean updateProduct(Product prd) {
		return productDao.updateProduct(prd);
	}

	@Override
	public List<Product> getProducts() {
		return productDao.getProducts();
	}
	
	@Override
	public List<Product> getShippedProducts() {
		return productDao.getShippedProducts();
	}
	
	@Override
	public Product getProductById(int productId) {
		return productDao.getProductById(productId);
	}

	

}
