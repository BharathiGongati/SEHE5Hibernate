import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("chinnu");
		p.setDob(LocalDate.parse("1999-06-05"));
		PanCard card=new PanCard();
		card.setNumber("huu@123");
		card.setPin(111);
		p.setCard(card);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(p);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();

	}

}
