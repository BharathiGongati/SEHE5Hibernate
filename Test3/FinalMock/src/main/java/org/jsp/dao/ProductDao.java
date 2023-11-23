package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.dto.Product;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ProductDao {
	@Autowired
	EntityManager manager;

	public Product saveProduct(Product product, int user_id) {
		User u = manager.find(User.class, user_id);
		if (u != null) {
			u.getProducts().add(product);// adding product to user
			product.setUsers(u);// assigning user to product
			EntityTransaction t = manager.getTransaction();
			manager.persist(product);
			t.begin();
			t.commit();
			return product;
		}
		return null;
	}

	public Product updateProduct(Product product, int user_id) {
		User u = manager.find(User.class, user_id);
		if (u != null) {
			u.getProducts().add(product);// adding product to user
			product.setUsers(u);// assigning user to product
			EntityTransaction t = manager.getTransaction();
			manager.merge(product);
			t.begin();
			t.commit();
			return product;
		}
		return null;
	}

	public Product findProductById(int id) {
		return manager.find(Product.class, id);
	}

	public boolean deleteProduct(int id) {
		Product u = findProductById(id);
		if (u != null) {
			manager.remove(u);
			EntityTransaction t = manager.getTransaction();
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}

	public List<Product> findProductByUserId(int user_id) {
		String hql = "select u.products from User u where u.id=?1";
		Query q = manager.createQuery(hql);
		q.setParameter(1, user_id);
		return q.getResultList();
	}

	public List<Product> findProductByCategory(String category) {
		String hql = "select p from Product p where p.category=?1";
		Query q = manager.createQuery(hql);
		q.setParameter(1, category);
		return q.getResultList();
	}

	public List<Product> findProductByBrand(String brand) {
		String hql = "select p from Product p where p.brand=?1";
		Query q = manager.createQuery(hql);
		q.setParameter(1, brand);
		return q.getResultList();
	}
}