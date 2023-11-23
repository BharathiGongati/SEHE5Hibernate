import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Person;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println("enter your id to delete the record");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Person p=manager.find(Person.class,id);
		if(p!=null) {
			manager.remove(p);
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			transaction.commit();
			System.out.println("Record is deleted");
		}
		
	}

}
