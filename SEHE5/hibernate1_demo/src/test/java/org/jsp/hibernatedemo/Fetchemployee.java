package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class Fetchemployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id to display the details");
		int id=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		employee e=s.get(employee.class, id);
		if(e!=null) {
			System.out.println("id:"+e.getId());
			System.out.println("name:"+e.getName());
			System.out.println("salary:"+e.getSalary());
			System.out.println("id:"+e.getDesg());
			
		}
		else {
			System.err.println("you have entered an invalid id");
		}
		
	}

}
