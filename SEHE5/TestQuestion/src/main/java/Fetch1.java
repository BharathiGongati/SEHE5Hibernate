import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name to fetch Products");
		String name=sc.next();
		String qry="select u.products from User u where u.name=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
        Query q=manager.createQuery(qry);
        q.setParameter(1, name);
        List<Product> pro=q.getResultList();
        for(Product produ:pro) {
        	System.out.println(produ);
        }


	}

	

}
