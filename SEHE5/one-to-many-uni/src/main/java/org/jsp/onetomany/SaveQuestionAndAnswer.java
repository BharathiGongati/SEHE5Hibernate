package org.jsp.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveQuestionAndAnswer {
public static void main(String[] args) {
//	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");

	Question q=new Question();
	q.setQuestion("what is hibernate");
	q.setQuestionedBy("sathish");
	
	Answer a1=new Answer();
	a1.setAnswer("It is a orm tool");
	a1.setAnsweredBy("Abhishek");
	
	Answer a2=new Answer();
	a2.setAnswer("It is a open source framework");
	a2.setAnsweredBy("Ankit");
	
	Answer a3=new Answer();
	a3.setAnswer("It is a non invasive framework");
	a3.setAnsweredBy("Aravind");
	
	List<Answer> answers=new ArrayList<Answer>();
	answers.add(a1);
	answers.add(a2);
	answers.add(a3);
	//assign answers for the qusestion
	q.setAnswers(answers);
	//q.setAnswers(new ArrayList<Answer>(Arrays.asList(a1,a2,a3)));
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(q);
		transaction.begin();
        transaction.commit();
}
}
