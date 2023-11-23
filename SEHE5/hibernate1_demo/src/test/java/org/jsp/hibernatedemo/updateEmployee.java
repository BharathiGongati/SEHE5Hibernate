package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateEmployee {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter your employee id to update the details");
		int eid=s.nextInt();
		String name=s.next();
		String desg=s.next();
		double salary=s.nextDouble();
		employee e=new employee();
		e.setId(eid);
		e.setName(name);
		e.setSalary(salary);
		e.setDesg(desg);
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.update(e);
		t.commit();
	}

}
