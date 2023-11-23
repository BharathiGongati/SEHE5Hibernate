import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Person;

public class VerifyPersonByIdandPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id and password");
		int id=sc.nextInt();
		String password=sc.next();
		String qry="select p from Person p where p.id=?1 and p.password=?2";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, id);
		q.setParameter(2, password);
		try {
		Person p=(Person) q.getSingleResult();
		System.out.println(p);
		
		
		
	}
		catch(NoResultException e) {
			System.out.println("no matching id and password");
		}

}
}
