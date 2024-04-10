package hibernate_relative;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		
		Car c =new Car();
		c.setBrand("TATA");
		c.setPrice(100000);
		
		Engine e=new Engine();
		e.setCc(400);
		e.setNoc(4);
		
		tran.begin();
		manager.persist(c);
		manager.persist(e);
		tran.commit();
	}
	

}
