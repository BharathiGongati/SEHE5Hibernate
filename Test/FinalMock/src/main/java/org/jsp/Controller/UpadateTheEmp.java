package org.jsp.Controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Dto.Employee;

public class UpadateTheEmp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to update the record");
		int id=sc.nextInt();
		Employee em=new Employee();
		em.setId(3);
		em.setName("chinni");
		em.setPassword("ch@123");
		em.setPhone(100);
		em.setSalary(80000);
		em.setDesignation("programmer");
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.merge(em);
		transaction.begin();
		transaction.commit();
		
	}

}
