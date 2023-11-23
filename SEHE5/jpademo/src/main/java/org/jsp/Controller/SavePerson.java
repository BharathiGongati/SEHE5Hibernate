package org.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Person;



public class SavePerson {
	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(24);
		p.setName("tanuja");
		p.setPassword("tanuja@123");
		p.setPhone(33444);
		p.setEmail("tanuja@gmail.com");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		manager.persist(p);
        EntityTransaction transaction=manager.getTransaction();
        transaction.begin();
        transaction.commit();
        System.out.println("person saved with id:"+p.getId());
	}

}
