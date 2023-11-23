import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("mouni");
		p.setDob(LocalDate.parse("1999-06-05"));
		PanCard card=new PanCard();
		card.setNumber("mouni@123");
		card.setPin(141);
		
		p.setCard(card);
		card.setP(p);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(card);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();

	}

}
