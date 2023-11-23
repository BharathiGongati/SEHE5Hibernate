package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllEmployees {
	public static void main(String[] args) {
		String hql="select e from employee e";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<employee> q=s.createQuery(hql);
		List<employee> emps=q.getResultList();
		for(employee e:emps) {
			System.out.println("id:"+e.getId());
			System.out.println("name:"+e.getName());
			System.out.println("salary:"+e.getSalary());
			System.out.println("desg:"+e.getDesg());
			System.out.println("----------*******------------");
		}
		
	}

}
