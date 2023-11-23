package org.jsp.Controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.Dto.Employee;

public class FetchEmployeeByDeptName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fetch by dept name");
		String name=sc.next();
		String qry="select d.employees from Department d where d.name=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		List<Employee> e4=q.getResultList();
		for(Employee e5:e4) {
			System.out.println(e5);
		}
		
	}

	
}
