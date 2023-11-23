import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ByAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age to fetch the record");
		int age=sc.nextInt();
		String qry="select p from Person p where p.age=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, age);
		try {
			Person p=(Person) q.getSingleResult();
			System.out.println(p.getName());
		}
		catch(NoResultException e) {
			System.err.println("no matching age");
		}
		
		
	}

}
