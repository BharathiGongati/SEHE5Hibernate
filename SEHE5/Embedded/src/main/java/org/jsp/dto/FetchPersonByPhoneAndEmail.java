package org.jsp.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPersonByPhoneAndEmail {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your phone and email");
		Long phone=sc.nextLong();
		String email=sc.next();
		PersonId id=new PersonId();
		id.setEmail(email);
		id.setPhone(phone);
		
		Person p=manager.find(Person.class, id);
		if(p!=null) {
			System.out.println(p.getAge());
			System.out.println(p.getName());
			System.out.println(p.getPassword());
			System.out.println(p.getId().getEmail());
			System.out.println(p.getId().getPhone());
		}
		else {
			System.err.println("Invalid phone and email");
		}
				
	
				}
	

	

}
