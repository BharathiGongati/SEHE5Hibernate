package org.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.FoodOrder;
import org.jsp.dto.User;

public class FoodDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();

	public FoodOrder addfood(FoodOrder order ,int id) {
		User u=manager.find(User.class, id);
		if(u!=null) {
			ArrayList<FoodOrder> f=new ArrayList<FoodOrder>();
			f.add(order);
			u.setOrder(f);
			order.setU(u);
			EntityTransaction t=manager.getTransaction();
			manager.persist(order);
			t.begin();
			t.commit();
			return order;
			
		}
		return null;
		
	}
	public FoodOrder updatefood(FoodOrder order ,int id) {
		User u=manager.find(User.class, id);
		if(u!=null) {
			ArrayList<FoodOrder> f=new ArrayList<FoodOrder>();
			f.add(order);
			u.setOrder(f);
			order.setU(u);
			EntityTransaction t=manager.getTransaction();
			manager.merge(order);
			t.begin();
			t.commit();
			return order;
			
		}
		return null;
	}
	public FoodOrder fetchbyid2(int id) {
		Query q=manager.createQuery("select u.order from User u where u.id=?1");
		q.setParameter(1, id);
		return (FoodOrder) q.getSingleResult();
		
	}
	public List fetchemailandpassword(String email,String password) {
		Query q=manager.createQuery("select u.order from User u where u.email=?1 and u.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		return q.getResultList();
		
	}
	public boolean delete(int id) {
		FoodOrder f=manager.find(FoodOrder.class, id);
		if(f!=null) {
			manager.remove(f);
			EntityTransaction t=manager.getTransaction();
			t.begin();
			t.commit();
		}
		return false;
	}
	public FoodOrder fetchbyid(int id) {
		Query q=manager.createQuery("select f from FoodOrder f where f.id=?1");
		q.setParameter(1, id);
		return (FoodOrder) q.getSingleResult();
		
	}
	
	
	
}
