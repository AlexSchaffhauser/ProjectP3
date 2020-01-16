package com.johnabbott.msn.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.msn.model.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public int insertProduct(Product prd) {
		sessionFactory.getCurrentSession().save(prd);
		return 1;
	}

	@Override
	public List<Product> getProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product where shipping is null", Product.class).list();
	}

	@Override
	public Product getProductById(int productId) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	@Override
	public boolean updateProduct(Product prd) {
		sessionFactory.getCurrentSession().update(prd);
		return true;
	}

	@Override
	public List<Product> getShippedProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product where shipping is not null", Product.class).list();
	}

	@Override
	public boolean deleteProduct(int productId) {
		Product fetchedProduct = getProductById(productId);
		sessionFactory.getCurrentSession().delete(fetchedProduct);
		return true;
	}

}
