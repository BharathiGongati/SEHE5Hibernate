import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id to delete");
	int id=sc.nextInt();
	String qry="select p from Person p where p.id=?1";
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=manager.createQuery(qry);
	q.setParameter(1,id);
	Person p=(Person) q.getSingleResult();
	manager.remove(p);
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	transaction.commit();


}
}
