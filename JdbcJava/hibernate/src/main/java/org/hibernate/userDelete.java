package org.hibernate;

import org.hibernate.cfg.Configuration;

public class userDelete {

	public static void main(String[] args) {
		Configuration config =new Configuration().configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tran =session.beginTransaction();
		user u=session.find(user.class, 1);
		if(u!=null) {
			session.delete(u);
			System.out.println("user deleted ");
			tran.commit();
			
		}
		else {
			System.out.println("user id not found");
		}
	}

	

}
