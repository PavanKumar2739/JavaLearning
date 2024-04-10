package hibernate_cascade_MTO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveHospital {
public static void main(String[] args) {
	
	hospital h=new hospital();
	h.setFounder("pavan");
	h.setName("ABC");
	
	
	
	branch b1=new branch();
	b1.setName("ABC 1");
	b1.setAdd("srikalahasti");
	b1.setHosp(h);
		
	branch b2=new branch();
	b2.setName("ABC 2");
	b2.setAdd("srikalahasti");
	b2.setHosp(h);
	
	List<branch> b=new ArrayList<branch>();
	b.add(b1);
	b.add(b2);
	
	h.setBranches(b);
	
	EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
	EntityManager managr= fac.createEntityManager();
	EntityTransaction tran=managr.getTransaction();
	tran.begin();
	managr.persist(h);
	tran.commit();
}
}
