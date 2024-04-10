package hibernate_OTM.pac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		library l=new library();
		l.setPlace("pavan");
		l.setName("ban");
		
		books b1=new books();
		b1.setAuthor("pavan");
		b1.setName("book");
		
	}
	

}
