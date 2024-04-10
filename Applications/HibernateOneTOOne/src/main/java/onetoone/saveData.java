package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveData {
    
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		
		questions q=new questions();
		q.setId(3);
		q.setSub("oracle");
		
		ans a=new ans();
		a.setAns("oracle is database language");
		a.setId(5);
		q.setA(a);
		
		questions q2=new questions();
		q2.setId(2);
		q2.setSub("python");
		
		ans a1=new ans();
		a1.setAns("java is programming intrupted language");
		a1.setId(2);
		q2.setA(a1);
		
		tran.begin();
//		manager.persist(a);
//		manager.persist(q);
		manager.persist(a1);
		//manager.persist(q2);
		tran.commit();

	}
}

