import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the questionby");
		int Questionid=sc.nextInt();
		
		String qry="select q.ans from Question q where q.id=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(qry);
		q.setParameter(1, Questionid);
		List<Answer> ans2=q.getResultList();
		for(Answer a:ans2) {
			System.out.println(a.getAnswerby());
		}
		
		
		
	}

	
	
}
