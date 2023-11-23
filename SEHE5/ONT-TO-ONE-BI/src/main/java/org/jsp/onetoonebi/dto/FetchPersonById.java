package org.jsp.onetoonebi.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		String qry="select p from Person p where id=?1";
	    EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	    Query q=manager.createQuery(qry);
	    q.setParameter(1, id);
	    try {
	    	Person p =(Person )q.getSingleResult();
	    	System.out.println(p.getName());
	    }
	     catch(NoResultException e) {
	    	 System.err.println("you entered invalid id");
	     }
		
	}

}
