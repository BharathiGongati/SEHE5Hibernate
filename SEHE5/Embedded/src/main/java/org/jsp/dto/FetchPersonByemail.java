package org.jsp.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonByemail {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();

	Scanner sc=new Scanner(System.in);
	System.out.println("enter your  email");
	String email=sc.next();
	
	Query q=manager.createQuery("select p from Person p where p.id.email=?1");
	q.setParameter(1, email);
	List<Person> p=q.getResultList();
	for(Person p1:p) {
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.getPassword());
		System.out.println(p1.getId().getEmail());
	}
	
	
}

}
