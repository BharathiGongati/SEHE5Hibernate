import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		User u=new User();
		u.setName("harshu");
		u.setPassword("h@123");
		u.setPhone(777);
		u.setEmail("g@gmail.com");
        
		Product p1=new Product();
		p1.setName("kurtas");
		p1.setPrice(900);
		p1.setCategory("m");
		p1.setBrand("avasa");
		p1.setUsers(u);
		
		Product p2=new Product();
		p2.setName("tops");
		p2.setPrice(800);
		p2.setCategory("l");
		p2.setBrand("admi");
		p2.setUsers(u);
		
		Product p3=new Product();
		p3.setName("tshirt");
		p3.setPrice(600);
		p3.setCategory("xl");
		p3.setBrand("cotton");
		p3.setUsers(u);
		
		List<Product> pro=new ArrayList<Product>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		
		u.setProducts(pro);
		
		
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(u);
		EntityTransaction t=manager.getTransaction();
		t.begin();
		t.commit();
		
	
	}
	
	

	

}
