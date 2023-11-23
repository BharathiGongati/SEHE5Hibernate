package org.jsp.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveEmployee {
	public static void main(String[] args) {
		employee e=new employee();
		e.setName("harshu");
		e.setDesg("employee");
		e.setSalary(60000);
		Configuration cfg=new Configuration().configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		Session s= factory.openSession();
	    int id=(Integer)s.save(e);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("employee saved with id:" +id);
		
		
	}

}
