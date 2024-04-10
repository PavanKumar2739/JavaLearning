package hibernate_cascade_update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateDelivery {
public static void main(String[] args) {
	EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
	EntityManager manager= fac.createEntityManager();
	EntityTransaction tran=manager.getTransaction();
	foodOrder f=manager.find(foodOrder.class, 2);
	f.setStatus("Order Placed");
	tran.begin();
	manager.merge	(f);
	tran.commit();
}
}
