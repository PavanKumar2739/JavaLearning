package hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class savePersion {
	public static void main(String[] args) {
		persion p=new persion();
		p.setAge(20);
		p.setName("pavan");
		
		persionId id=new persionId();
		id.setEmail("pavan@email");
		id.setPhone(2938488);
		p.setId(id);
		
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager managr= fac.createEntityManager();
		EntityTransaction tran=managr.getTransaction();
		tran.begin();
		managr.persist(p);
		tran.commit();

	}
	
}
