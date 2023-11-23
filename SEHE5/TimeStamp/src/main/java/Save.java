import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		TimeStamp t=new TimeStamp();
		t.setCost(100);
		t.setFood_item("Biriyani");
		manager.persist(t);
		EntityTransaction tr=manager.getTransaction();
		tr.begin();
		tr.commit();
		
	}

	

}
