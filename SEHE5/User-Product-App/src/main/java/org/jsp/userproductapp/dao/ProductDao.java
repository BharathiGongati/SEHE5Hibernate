package org.jsp.userproductapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.userproductapp.dto.Product;
import org.jsp.userproductapp.dto.User;

public class ProductDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	public Product saveProduct(Product product,int user_id) {
		User u=manager.find(User.class,user_id );
		if(u!=null) {
//			u.getProducts().add(product);//adding product to user
			List<Product> pro=new ArrayList<Product>();
			pro.add(product);
			product.setUser(u);//assigning user to product
			u.setProducts(pro);
			EntityTransaction transaction=manager.getTransaction();
			manager.persist(product);
			transaction.begin();
			transaction.commit();
			return product;
			
		}
		return null;
		
	}
	public Product upadateProduct(Product product,int user_id) {
		User u=manager.find(User.class,user_id );
		if(u!=null) {
			List<Product> pro=new ArrayList<Product>();
			pro.add(product);
			product.setUser(u);//assigning user to product
			u.setProducts(pro);
			manager.merge(product);
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return product;
			
			
		}
		return null;
	}
	public boolean deleteProd(int id) {
		Product p=manager.find(Product.class, id);
		if(p!=null) {
			manager.remove(p);
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return true;
			
		}
		return false;
		
		
	}
	public Product fetchProduct(int id) {
		return manager.find(Product.class, id);
		
		
	}
	public List<Product> fetchProductsbyusername(String name) {
		String qry="select u. products from User u where u.name=?1";
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		return q.getResultList();
		
	}
	public List<Product> fetchprodbyusernameid(String name,int id) {
		String qry="select u. products from User u where u.name=?1 and u.id=?2";
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		q.setParameter(2, id);
		return q.getResultList();
		
		
	}



	

}
