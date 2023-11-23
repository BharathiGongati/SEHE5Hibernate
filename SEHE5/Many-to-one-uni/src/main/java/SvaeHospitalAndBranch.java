import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SvaeHospitalAndBranch {
	public static void main(String[] args) {
		Hospital h=new Hospital();
		h.setName("Apollo");
		h.setGst("Apl123");
		h.setFounder("ABC");
		
		Branch b1=new Branch();
		b1.setName("Apollo Bangalore");
		b1.setEmail("AB@gmail.com");
		b1.setPhone(777);
		b1.setHospital(h);
		
		Branch b2=new Branch();
		b2.setName("Apollo Mangalore");
		b2.setEmail("AM@gmail.com");
		b2.setPhone(888);
		b2.setHospital(h);
		
		Branch b3=new Branch();
		b3.setName("Apollo Mysore");
		b3.setEmail("Amys@gmail.com");
		b3.setPhone(666);
		b3.setHospital(h);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();
				
		
	}

}
