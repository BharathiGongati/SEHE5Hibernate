import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Person;

public class VerifyPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your phone number and password");
		Long phone=sc.nextLong();
		String password=sc.next();
		String qry="select p from Person p where p.phone=?1 and p.password=?2";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1,phone);
		q.setParameter(2,password);
		try {
		Person p=(Person) q.getSingleResult();//record lekapote NoresultException vastundhi error ento telusukodaniki try catch lo pettamu
		System.out.println("Hello Mr."+p.getName()+"your login is Success");
		System.out.println(p);
		
		
	}
		catch(NoResultException e) {
			System.out.println("Invalid phone number or password");
		}

}
}
