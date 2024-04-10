package hibernate_cascade_update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveFood {
	public static void main(String[] args) {
		foodOrder f=new foodOrder();
		f.setItem("Chicken Biryani");
		f.setStatus("order NotPlaced");
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager manager= fac.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		manager.persist(f);
		tran.commit();
		
		
	}

}
