package org.jsp.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.dto.User;

public class UserDao {
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	public User saveUser(User user) {
		s.save(user);
		Transaction t=s.beginTransaction();
		t.commit();
		return user;
		
	}
	public User updateUser(User user) {
		s.update(user);
		Transaction t=s.beginTransaction();
		t.commit();
		return user;
	}
	public User findUserById(int id) {
		return s.get(User.class, id);
		
		
	}
	public boolean deleteUser(int id) {
		User u=findUserById(id);
		if(u!=null) {
			s.delete(u);
			Transaction t=s.beginTransaction();
			t.commit();
			return true;
			
		}
		return false;
	}
	public User verifyUser(long phone,String password) {
		String hql="select u from User u where u.phone=?1 and u.password=?2";
		Query<User> q=s.createQuery(hql);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
		return q.getSingleResult();
		}
		catch(NoResultException e) {
		return null;
		}

}
}
