package org.jsp.deptempApp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.deptempApp.dto.Department;
import org.jsp.deptempApp.dto.Employee;

public class EmpDao {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	public Employee saveEmployee(Employee emp,int did) {
		Department d=manager.find(Department.class,did);
		if(d!=null) {
			List<Employee> e1=new ArrayList<Employee>();
			e1.add(emp);
			d.setEmp(e1);
			emp.setDept(d);
//			d.getEmp().add(emp);
//			emp.setDept(d);
			
			EntityTransaction t=manager.getTransaction();
			manager.persist(emp);
			t.begin();
			t.commit();
			return emp;
			
			
		}
		return null;
		
	}
	public Employee updateEmp(Employee emp,int did) {
		Department d=manager.find(Department.class,did);
		if(d!=null) {
			List<Employee> e1=new ArrayList<Employee>();
			e1.add(emp);
			d.setEmp(e1);
			emp.setDept(d);
//			d.getEmp().add(emp);
//			emp.setDept(d);
			
			EntityTransaction t=manager.getTransaction();
			manager.merge(emp);
			t.begin();
			t.commit();
			
			return emp;
			
		}
		return null;
		
		
		
	}
	public boolean deleteEmp(int id) {
		Employee e=manager.find(Employee.class,id);
		if(e!=null) {
		    manager.remove(e);
		    EntityTransaction t=manager.getTransaction();
		    t.begin();
		    t.commit();
		    return true;
	    }
		return false;
	}
	public List<Employee> empfetch(String name){
		String qry="select d.emp from Department d where d.name=?1";
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		return q.getResultList();
		
	}
	public List<Employee> fetchemp(int id) {
		String qry="select d.emp from Department d where d.id=?1";
		Query q=manager.createQuery(qry);
		q.setParameter(1, id);
		return  q.getResultList();
		
		
	}
}

	


