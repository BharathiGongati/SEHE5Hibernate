package org.springhibernatedemo.controller;

import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.DepartmentDao;
import org.jsp.springhibernatedemo.dao.EmployeeDao;
import org.jsp.springhibernatedemo.dto.Department;
import org.jsp.springhibernatedemo.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import antlr.collections.List;

public class EmployeeController {
	static Scanner s = new Scanner(System.in);
	static EmployeeDao dao;
	static DepartmentDao deptdao;
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-template.xml");
		dao = context.getBean(EmployeeDao.class);

		deptdao = context.getBean(DepartmentDao.class);

	}

	public static void main(String[] args) {
		System.out.println("1. save Employee");
		System.out.println("2.update employee");
		System.out.println("3.fetch employee by id");
		System.out.println("4.delete employee");
		System.out.println("5.fetch all the employees");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			save();
			break;
		}
		case 2: {
			update();
			break;
		}
		case 3: {
			fetchbyid();
			break;
		}
		case 4: {
			delete();
			break;
		}
		case 5: {
			fetchalltheemployees();
			break;
		}
		case 6:{
			saveDept();
		}
		case 7:{
			updateDept();
		}
		case 8:{
			
			fetchDept();
		}

		}
	}

	

	


	





	public static void save() {
		Employee e=new Employee();
		System.out.println("enter name,desg,sal");
		String name=s.next();
		String desg=s.next();
		Long salary=s.nextLong();
		e.setName(name);
		e.setDesg(desg);
		e.setSalary(salary);
		dao.saveEmployee(e);

	}

	public static void update() {
		Employee e=new Employee();
		System.out.println("enter id to update");
		int id=s.nextInt();
		String name=s.next();
		String desg=s.next();
		Long salary=s.nextLong();
		e.setId(id);
		e.setName(name);
		e.setDesg(desg);
		e.setSalary(salary);
		dao.updateEmployee(e);
		

	}

	
	public static void fetchbyid() {
		System.out.println("enter the id to fetch");
		int id=s.nextInt();
		Employee e=dao.findEmployeeById(id);
		System.out.println(e);
		

	}

	public static void delete() {
		System.out.println("enter the id to delete");
		int id=s.nextInt();
		dao.deleteEmployee(id);
		

	}

	public static void fetchalltheemployees() {
		java.util.List<Employee> e= dao.findAll();
		for(Employee e1:e) {
			System.out.println(e1);
		}

	}
	private static void saveDept() {
		String name=s.next();
		String location=s.next();
		Department d=new Department();
		d.setLocation(location);
		d.setName(name);
		deptdao.saveDeprtment(d);
		
	}
	private static void updateDept() {
		System.out.println("enter id to update");
		int id=s.nextInt();
		String name=s.next();
		String location=s.next();
		Department d=new Department();
		d.setId(id);
		d.setLocation(location);
		d.setName(name);
		deptdao.updateDepartment(d);
		
		
	}
	private static void fetchDept() {
		int id=s.nextInt();
		deptdao.findDepartmentById(id);
		
		
	}

	

	
	

}
