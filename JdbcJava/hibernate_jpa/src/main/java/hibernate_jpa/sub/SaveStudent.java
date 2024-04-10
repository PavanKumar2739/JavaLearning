package hibernate_jpa.sub;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("pavan");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction trans=manager.getTransaction();
	student stu=new student();
	stu.setName("pavan");
	stu.setPerc(40);
	stu.setPhone(29425432);
	trans.begin();
	manager.persist(stu);
	trans.commit();
}
}
