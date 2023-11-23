import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchBatchByStudentName {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
			EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		   String 	qry="select s.batch from Student s where s.name=?1";
		   Query q=manager.createQuery(qry);
		   q.setParameter(1, name);
		  List<Batch> b= q.getResultList();
		  for(Batch b1:b) {
			  System.out.println(b1);
		  }
		
	
	}

	

}
