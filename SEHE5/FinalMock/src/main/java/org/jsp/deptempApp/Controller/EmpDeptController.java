package org.jsp.deptempApp.Controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.deptempApp.dao.DeptDao;
import org.jsp.deptempApp.dao.EmpDao;
import org.jsp.deptempApp.dto.Department;
import org.jsp.deptempApp.dto.Employee;

public class EmpDeptController {
	static DeptDao dDao = new DeptDao();
	static EmpDao eDao = new EmpDao();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("save emp");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			saveDept();
			break;

		}
		case 2: {
			saveEmp();
			break;

		}
		case 3: {
			deptupdate();
			break;

		}
		case 4: {
			empupdate();
			break;

		}
		case 5: {
			deptDelete();
			break;

		}
		case 6: {
			empDelete();
			break;

		}
		case 7: {
			empfetch();
			break;

		}
		case 8: {
			empfetch2();
			break;

		}
		}
	}

	public static void saveDept() {
		Department d = new Department();
		System.out.println(" enter the location,name");
		String location = sc.next();
		String name = sc.next();
		d.setLocation(location);
		d.setName(name);
		dDao.savedepartment(d);

	}

	public static void saveEmp() {
		Employee e = new Employee();
		System.out.println("enter the  deptid,name,desg,sal,phone,password");
		int deptid = sc.nextInt();

		String name = sc.next();
		String desg = sc.next();
		double sal = sc.nextDouble();
		long phone = sc.nextLong();
		String password = sc.next();
		e.setName(name);
		e.setDesg(desg);
		e.setSal(sal);
		e.setPhone(phone);
		e.setPassword(password);
		eDao.saveEmployee(e, deptid);

	}

	public static void deptupdate() {
		System.out.println("enter the id to update");
		int id = sc.nextInt();
		System.out.println("enter the location, name");
		String location = sc.next();
		String name = sc.next();
		Department d = new Department();
		d.setId(id);
		d.setLocation(location);
		d.setName(name);
		dDao.UpdateDept(d);

	}

	public static void empupdate() {
		Employee e = new Employee();
		System.out.println("enter the deptid to fetch dept record");
		int did1 = sc.nextInt();
		System.out.println("enter the details to update emp ,id,name,desg,sal,phone,password");
		int eid = sc.nextInt();
		String name = sc.next();
		String desg = sc.next();
		double sal = sc.nextDouble();
		long phone = sc.nextLong();
		String password = sc.next();
		e.setId(eid);
		e.setName(name);
		e.setDesg(desg);
		e.setSal(sal);
		e.setPhone(phone);
		e.setPassword(password);
		eDao.updateEmp(e, did1);

	}

	private static void deptDelete() {
		int deptid = sc.nextInt();
		dDao.deleleteDept(deptid);

	}

	private static void empDelete() {
		int id = sc.nextInt();
		eDao.deleteEmp(id);

	}

	private static void empfetch() {
		String name = sc.next();
		List<Employee> e = eDao.empfetch(name);
		for (Employee e2 : e) {
			System.out.println(e2);
		}
	}

	private static void empfetch2() {
		int id = sc.nextInt();
		List<Employee> e = eDao.fetchemp(id);
		for (Employee e2 : e) {
			System.out.println(e2);
		}

	}

}
