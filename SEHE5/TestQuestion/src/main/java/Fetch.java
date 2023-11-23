import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the category");
		String category=sc.next();
		String qry="select p from Product p where p.category=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
        Query q=manager.createQuery(qry);
        q.setParameter(1, category);
        Product pr=(Product)q.getSingleResult();
        System.out.println(pr);
        
	}

	

}
