package org.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Department;
import org.jsp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
@Component
public class EmployeeDao {
	@Autowired
	EntityManager manager;
	public Employee saveemp(Employee emp,int eid) {
		Department d=manager.find(Department.class, eid);
		EntityTransaction t=manager.getTransaction();
		List<Employee> e1=new ArrayList<Employee>();
		e1.add(emp);
		d.setEmp(e1);
		emp.setDept(d);
		
		manager.persist(emp);
		t.begin();
		t.commit();
		return emp;
		
	}
	public Employee updateemp(Employee emp,int eid) {
		Department d=manager.find(Department.class, eid);
		EntityTransaction t=manager.getTransaction();
		List<Employee> e1=new ArrayList<Employee>();
		e1.add(emp);
		d.setEmp(e1);
		emp.setDept(d);
		
		manager.merge(emp);
		t.begin();
		t.commit();
		return emp;
		
	}
	public boolean deleteEmp(int id) {
		EntityTransaction t=manager.getTransaction();
		Employee e=manager.find(Employee.class,id);
		if(e!=null) {
			manager.remove(e);
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}
	public Employee findEmployeeById(int id) {
		return manager.find(Employee.class, id);
	}
}


