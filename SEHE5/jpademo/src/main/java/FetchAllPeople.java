import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Person;

public class FetchAllPeople {
	public static void main(String[] args) {
		String qry="select p from Person p";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		List<Person> per=q.getResultList();
		for(Person n:per){
			System.out.println(n);
			
			
		}
		
	}

}
