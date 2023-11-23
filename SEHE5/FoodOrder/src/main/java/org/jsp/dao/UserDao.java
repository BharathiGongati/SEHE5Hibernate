package org.jsp.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.User;

public class UserDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	public User saveUser(User u) {
		EntityTransaction t=manager.getTransaction();
		manager.persist(u);
		t.begin();
		t.commit();
		return u;
		

	}
	public User  updateUser(User u) {
		EntityTransaction t=manager.getTransaction();
		manager.merge(u);
		t.begin();
		t.commit();
		return u;
		

	}
	public List fetchUser(String email,String password) {
		Query q=manager.createQuery("select u from User u where u.email=?1 and u.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		return q.getResultList();
		
	}
	
	

	

}
