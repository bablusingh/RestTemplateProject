package com.restpro.repositories;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restpro.entities.Product;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(product);
		return product;
	}

	@Override
	public Product getSingleProduct(long id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Product.class, id);

	}

	@Override
	public Map<String, Object> getAllProduct() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Product.class).addOrder(Order.desc("id"));
		Map<String, Object> data = new HashMap<>();
		data.put("data", criteria.list());

		return data;
	}

}
