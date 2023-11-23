package org.jsp.deptempApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.deptempApp.dto.Department;

public class DeptDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	
	public Department savedepartment(Department dept) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(dept);
		 
		 transaction.begin();
		 transaction.commit();
		
		return dept;
		
		
		
	}
	public  Department UpdateDept(Department dept) {
		EntityTransaction transaction=manager.getTransaction();
		manager.merge(dept);
		 
		 transaction.begin();
		 transaction.commit();
		
		return dept;
		
		
	}
	public boolean deleleteDept(int id) {
		Department d=manager.find(Department.class,id);
			if(d!=null) {
				EntityTransaction transaction=manager.getTransaction();
				manager.remove(d);
				transaction.begin();
				 transaction.commit();
				
				return true;
				
			}
			return false;
			
		}
	}






