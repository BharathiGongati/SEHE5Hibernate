package org.jsp.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name,password,age,phone,email");
	String name=sc.next();
	String password=sc.next();
	int age=sc.nextInt();
	Long phone=sc.nextLong();
	String email=sc.next();
	
	PersonId id=new PersonId();
	id.setEmail(email);
	id.setPhone(phone);
	
	Person p=new Person();
	p.setAge(age);
	p.setId(id);
	p.setName(name);
	p.setPassword(password);
	
	
	manager.persist(p);
	transaction.begin();
	transaction.commit();
	
	
	
	
	
	
	

	
	

	

}
}
