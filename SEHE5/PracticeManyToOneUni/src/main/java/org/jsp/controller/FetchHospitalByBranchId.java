package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchHospitalByBranchId {
	public static void main(String[] args) {
		System.out.println("enter branch id");
		Scanner sc=new Scanner(System.in);
		int bid=sc.nextInt();
		 String qry="select b.hos from Branch b where b.id=?1";
		 EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();

		 Query q=manager.createQuery(qry);
		 q.setParameter(1, bid);
		 Hospital b=(Hospital) q.getSingleResult();
		 System.out.println(b);
		
	}

	

}
