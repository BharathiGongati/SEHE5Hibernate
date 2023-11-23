package org.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		Department d=new Department();
		d.setName("Development");
		d.setLocation("Bangalore");
		
		Employees e1=new Employees();
		e1.setName("bharu");
		e1.setDesg("trainer");
		e1.setSal(10000);
		
		Employees e2=new Employees();
		e2.setName("harshu");
		e2.setDesg("hr");
		e2.setSal(20000);
		
		Employees e3=new Employees();
		e3.setName("bittu");
		e3.setDesg("software");
		e3.setSal(30000);
		List<Employees> emp=new ArrayList<Employees>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		d.setEmps(emp);
		
		e1.setDept(d);
		e2.setDept(d);
		e3.setDept(d);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t=manager.getTransaction();
		manager.persist(e1);
		manager.persist(e2);
		manager.persist(e3);
		t.begin();
		t.commit();
		
		
		
		
	}

	

}
