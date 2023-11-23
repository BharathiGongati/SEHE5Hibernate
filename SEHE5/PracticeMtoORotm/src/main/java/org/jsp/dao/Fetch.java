package org.jsp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		System.out.println("enter the employee name to fetch dept");
		Scanner sc=new Scanner(System.in);
		String ename =sc.next();
		String qry="select e.dept from Employees e where e.name=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, ename);
		Department d=(Department)q.getSingleResult();
		System.out.println(d);
		
		
		
	}

	

}
