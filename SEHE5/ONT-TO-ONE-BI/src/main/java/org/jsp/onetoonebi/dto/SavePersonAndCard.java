package org.jsp.onetoonebi.dto;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndCard {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("kiran");
	p.setPhone(100);
	p.setAge(25);
	
	Pancard card=new Pancard();
	card.setDob(LocalDate.parse("1999-12-07"));
	card.setNumber("kiran@123");
	card.setPincode(9995);
	card.setP(p);
	p.setCard(card);//Assigning pancard for person
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(p);
	transaction.begin();
	transaction.commit();
  
}
}
