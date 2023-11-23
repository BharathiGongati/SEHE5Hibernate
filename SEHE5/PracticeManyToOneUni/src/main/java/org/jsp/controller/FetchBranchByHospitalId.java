package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchBranchByHospitalId {
	public static void main(String[] args) {
		System.out.println("enter hospital id");
		Scanner sc=new Scanner(System.in);
		int hid=sc.nextInt();
		 String qry="select b from Branch b where b.hos.id=?1";
		 EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();

		 Query q=manager.createQuery(qry);
		 q.setParameter(1, hid);
		 List<Branch> branch=q.getResultList();
		 for(Branch ba:branch){
			 System.out.println(ba);
		 }
	
	}

	

}
