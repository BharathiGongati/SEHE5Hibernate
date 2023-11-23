import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetching {
	public static void main(String[] args) {
		System.out.println("enter the email to fetch the record");
		Scanner sc=new Scanner(System.in);
		String mail=sc.next();
		String qry="select u from User u where u.email=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, mail);
		List<User> u=q.getResultList();
		for(User u1:u) {
			System.out.println(u1);
		}
		
	}

}
