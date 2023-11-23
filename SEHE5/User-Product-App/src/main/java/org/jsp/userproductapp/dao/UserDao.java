package org.jsp.userproductapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.userproductapp.dto.User;

public class UserDao {
	
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		public User saveUser(User user) {
			EntityTransaction transaction=manager.getTransaction();
			manager.persist(user);
			transaction.begin();
			transaction.commit();
			return user;
		}
		public User upadateUser(User user) {
			EntityTransaction transaction=manager.getTransaction();
			manager.merge(user);
			transaction.begin();
			transaction.commit();
			return user;
		}
		public boolean deleteUser(int id) {
			
			User u=manager.find(User.class, id);
			if(u!=null) {
				manager.remove(u);
				EntityTransaction transaction=manager.getTransaction();
				transaction.begin();
				transaction.commit();
				return true;
			}
			return false;
		}
		public User fetchUser(int id) {
			return manager.find(User.class, id);
			
			
		}
		public List<User> fetchUser(String em,String na) {
			String qry="select u from User u where u.email=?1 and u.name=?2";
			Query q=manager.createQuery(qry);
			q.setParameter(1, em);
			q.setParameter(2, na);
			
			return q.getResultList();
			
		}
		
	

	

}
