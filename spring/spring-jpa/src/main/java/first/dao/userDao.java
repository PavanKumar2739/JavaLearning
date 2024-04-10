package first.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import first.dto.User;

public class userDao {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction tran=manager.getTransaction();
	public User saveUser(User user) {
		manager.persist(user);
		tran.begin();
		tran.commit();
		return user;
		
		
		
	}

}
