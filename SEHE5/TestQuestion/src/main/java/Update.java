import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the id to update");
		int id=s.nextInt();
		User u=new User();
		u.setName("cde");
		u.setPassword("ab@123");
		u.setPhone(444);
		u.setId(1);
		u.setEmail("Kavi@gmail.com");
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.merge(u);
	EntityTransaction t=manager.getTransaction();
	t.begin();
	t.commit();
	
	}

	

}
