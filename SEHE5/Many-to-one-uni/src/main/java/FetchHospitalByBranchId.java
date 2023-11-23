import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchHospitalByBranchId {
public static void main(String[] args) {
	 String qry="select b.hospital from Branch b where b.id=?1";
	 EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the branch id to display hospital details");
	 int bid=s.nextInt();
	 Query q=manager.createQuery(qry);
	 q.setParameter(1, bid);
	 try {
		 Hospital h=(Hospital)q.getSingleResult();
		 System.out.println("Id:"+h.getId());
		 System.out.println("Name:"+h.getName());
		 System.out.println("Founder:"+h.getFounder());
		 System.out.println("Gst:"+h.getGst());
		 
		 
	 }
	 catch(NonUniqueResultException e)
	 {
		 System.out.println("Invalid branch id");
	 }	 
	 
}
}
