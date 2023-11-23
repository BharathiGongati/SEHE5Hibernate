import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {
	public static void main(String[] args) {
		Person p=new Person();
		Person p2=new Person();
		p2.setName("Harshu");
		p2.setAge(27);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		p.setName("bharu");
		p.setAge(24);
		manager.persist(p);
		manager.persist(p2);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}

}
