package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteEmployee {
	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the employee id to delete");
		int eid=sc.nextInt();
		employee e=s.get(employee.class, eid);
		if(e!=null) {
			s.delete(e);
			System.out.println("your details are deleted succesfully");
			t.commit();
		}
		else {
			System.err.println("you have entered an invalid id");
		}
		
	}

}
