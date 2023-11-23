import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmpAndDept {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Department d=new Department();
		d.setName("development");
		d.setLocation("Btm layout");
		
		Employee e1=new Employee();
		e1.setDept(d);
		e1.setDesg("trainer");
		e1.setName("ABC");
	    e1.setSallary(2344);
	    
	    Employee e2=new Employee();
		e2.setDept(d);
		e2.setDesg("Hr");
		e2.setName("XYZ");
	    e2.setSallary(1344);
	    
	    Employee e3=new Employee();
		e3.setDept(d);
		e3.setDesg("tracker");
		e3.setName("PQR");
	    e3.setSallary(456);
	    d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));
	    
	    manager.persist(d);
	    transaction.begin();
	    transaction.commit();
	    
	 }

}
