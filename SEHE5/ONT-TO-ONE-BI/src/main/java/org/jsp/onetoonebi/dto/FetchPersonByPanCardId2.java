package org.jsp.onetoonebi.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonByPanCardId2 {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Pan card number");
		int panid=sc.nextInt();
//		String qry="select p from Person p where p.card.id=?1";
		String qry="select pc.p from Pancard pc where pc.id=?1";
		Query q=manager.createQuery(qry);
		 q.setParameter(1, panid);
		 try {
		  Person m=(Person)q.getSingleResult();
		  System.out.println(m.getName());
		  System.out.println(m.getAge());
		  System.out.println(m.getPhone());
		  System.out.println(m.getId());
		  }
		 catch(NoResultException 	e) {
			 System.err.println("you have entered an invalid id");
		 }
		
		
		
		
	}

}
