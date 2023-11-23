package serviceimpl;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService {
	ArrayList<Employee> l1=new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);

	@Override
	public void addEmployee() {
		System.out.println("======Enter Employee Details=======");
		System.out.println("=====Enter the Employee name=========");
		
		
	}

}
