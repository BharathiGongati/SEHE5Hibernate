 import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.jsp.dto.Person;

public class FindPersonByAge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your age to find the person");
		int age=s.nextInt();
		Long phone=s.nextLong();
		String name=s.next();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q1=manager.createNamedQuery("findByAge");
		Query q2=manager.createNamedQuery("findByPhone");
		Query q3=manager.createNamedQuery("findByName");
		q1.setParameter(1, age);
		q2.setParameter(2,phone );
		q3.setParameter(3,name );
		List<Person> persons1=q1.getResultList();
		List<Person> persons2=q3.getResultList();
		 Person p=(Person) q2.getSingleResult();
		 System.out.println(p);
		for(Person p1:persons1) {
			System.out.println(p1);
		}
		for(Person p2:persons2) {
			System.out.println(p2);
		}

	}

}
