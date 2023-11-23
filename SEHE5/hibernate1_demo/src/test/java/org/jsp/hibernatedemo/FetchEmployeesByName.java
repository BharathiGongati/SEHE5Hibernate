package org.jsp.hibernatedemo;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmployeesByName {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name to display employee details");
		String name=sc.next();
		String hql="select e from employee e where e.name=:nm";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<employee> q=s.createQuery(hql);
		q.setParameter("nm", name);
		List<employee> emps=q.getResultList();
		if(emps.size()>0) {
			for(employee e:emps) {
				System.out.println("id:"+e.getId());
				System.out.println("name:"+e.getName());
				System.out.println("salary:"+e.getSalary());
				System.out.println("designation:"+e.getDesg());
				System.out.println("--------******---------");
			}
			
		}
		else {
			System.err.println("no employee found with the name :"+name);
		}
		
	}

}
