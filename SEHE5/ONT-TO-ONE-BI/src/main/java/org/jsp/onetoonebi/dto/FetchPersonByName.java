package org.jsp.onetoonebi.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonByName {
	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner sc =new Scanner(System.in);
		String qry="select p from Person p where p.name=?1";
		String name=sc.next();
	    EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		List<Person> m= q.getResultList();
		for(Person n:m) {
			System.out.println(n);
		}
	}

}
