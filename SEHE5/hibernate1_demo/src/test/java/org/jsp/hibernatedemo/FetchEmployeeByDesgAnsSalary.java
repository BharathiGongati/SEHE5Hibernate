package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmployeeByDesgAnsSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the designation and salary to display details");
		String desg=sc.nextLine();
		double salary=sc.nextDouble();
		String qry="select e from employee e where e.desg=?1 and e.salary=?2";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<employee> q=s.createQuery(qry);
		q.setParameter(1,desg);
		q.setParameter(2, salary);
		List<employee> emps=q.getResultList();
		if(emps.size()>0) {
			for(employee e:emps) {
				System.out.println(e);
			}
		}
		else {
			System.err.println("no employee found with the entered result");
		}
	}

}
