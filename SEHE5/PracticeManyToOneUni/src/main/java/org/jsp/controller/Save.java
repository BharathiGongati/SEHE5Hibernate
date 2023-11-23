package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		Hospital h=new Hospital();
		h.setName("APollo");
		h.setGst("AP123");
		h.setFounder("ABC");
		
		Branch b1=new Branch();
		b1.setName("Apollo Bngalore");
		b1.setEmail("ab@gmail.com");
		b1.setPhone(333);
		b1.setHos(h);
		
		Branch b2=new Branch();
		b2.setName("Apollo Mysore");
		b2.setEmail("bc@gmail.com");
		b2.setPhone(444);
		b2.setHos(h);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t=manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		t.begin();
		t.commit();
		
		
		
		
	}

	

}
