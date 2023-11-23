package app;

import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmployeeServiceimpl;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService e1=new EmployeeServiceimpl();
		System.out.println("=========Employee Db===========");
		while(true) {
			System.out.println("=======Menu========");
			System.out.println("1.Add Employee\n2.Get Employee By Eid\n3.");
		}
		
	}

}
