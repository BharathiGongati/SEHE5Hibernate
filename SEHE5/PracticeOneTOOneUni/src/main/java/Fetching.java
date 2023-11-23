import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the person name to fetch pancard");
		String name=sc.next();
		String qry="select p.card from Person p where p.name=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		List<PanCard> card1=q.getResultList();
		for(PanCard pl:card1) {
			System.out.println(pl);
		}
		

	}
}
