import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	Student s1= new Student();
	s1.setName("bittu");
	s1.setPhone(333);
	s1.setPerc(70.0);
	
	
	Student s2= new Student();
	s2.setName("harshu");
	s2.setPhone(444);
	s2.setPerc(80.0);
	
	
	Student s3= new Student();
	s3.setName("bittu");
	s3.setPhone(333);
	s3.setPerc(70.0);
	
	Batch b1=new Batch();
	b1.setCode("se1");
	b1.setSubject("hibernate");
	
	
	Batch b2=new Batch();
	b2.setCode("se2");
	b2.setSubject("spring");
	
	Batch b3=new Batch();
	b3.setCode("se3");
	b3.setSubject("java");
	
	
	List<Student> s=new  ArrayList<Student>();
	s.add(s1);
	s.add(s2);
	s.add(s3);
	
	b1.setStu(s);
	b2.setStu(s);
	b3.setStu(s);

	List<Batch> b=new  ArrayList<Batch>();
	b.add(b1);
	b.add(b2);
	b.add(b3);
	
	s1.setBatch(b);
	s2.setBatch(b);
	s2.setBatch(b);
	


	
	
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction();
//	manager.persist(b1);
//	manager.persist(b2);
//	manager.persist(b3);
	//bidirection kabatti denni save chesina records save aipotai
	manager.persist(s1);
	manager.persist(s2);
	manager.persist(s3);
	
	t.begin();
	t.commit();
	
}
}
	
	
	
	
	


