import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		Question q=new Question();
		
		q.setQuestion("what is hibernate");
		q.setQuestionBy("sathish");
		
		Answer a1=new Answer();
		a1.setAnswer("It is a orm tool");
		a1.setAnswerby("Abhishek");
		
		Answer a2=new Answer();
		a2.setAnswer("It is a open source framework");
		a2.setAnswerby("Ankit");
		
		Answer a3=new Answer();
		a3.setAnswer("It is a non invasive framework");
		a3.setAnswerby("Aravind");
		
		List<Answer> ans1=new ArrayList<Answer>();
		ans1.add(a1);
		ans1.add(a2);
		ans1.add(a3);
		q.setAns(ans1);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		EntityTransaction t=manager.getTransaction();
		manager.persist(q);
		t.begin();
		t.commit();
	}

}
