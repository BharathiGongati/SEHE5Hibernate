package org.jsp.onetoonebi.dto;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonByPanCardNumber {
	public static void main(String[] args) {
		System.out.println("enter the pancardnumber");
		Scanner sc =new Scanner(System.in);
		String number=sc.next();
//		String qry="select p from Person p where p.card.number=?1";
		String qry="select pc.p from Pancard pc where pc.number=?1";
		
	    EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, number);
		try {
			Person p=(Person) q.getSingleResult();
			System.out.println("id:"+p.getId());
			System.out.println("name:"+p.getName());
			System.out.println("Age:"+p.getAge());
			System.out.println("phone:"+p.getPhone());
			
			
			
		}
		catch(NoResultException e) {
			System.out.println("you have entered an invalid pancard number");
		}
		
			}

}
