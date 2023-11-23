package org.jsp.onetooneuni.dto;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndCard {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("ABC");
	p.setPhone(777);
	p.setAge(24);
	
	Pancard card=new Pancard();
	card.setDob(LocalDate.parse("1988-11-07"));
	card.setNumber("ifelse1345L");
	card.setPincode(123456);
	p.setCard(card);//Assigning pincode for person
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(p);
	transaction.begin();
	transaction.commit();
  
}
}
