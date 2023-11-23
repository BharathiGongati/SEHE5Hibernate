import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to update a record");
		int id=sc.nextInt();
		Person p=new Person();
		p.setId(id);
		p.setName("kavi");
		p.setAge(27);
		manager.merge(p);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();

		
		
	}

}
