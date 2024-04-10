package org.hibernate;

import org.hibernate.cfg.Configuration;

public class getUser {
public static void main(String[] args) {
	Configuration config =new Configuration().configure();
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	
	user u=session.find(user.class, 1);
	if(u!=null) {
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getAge());
		System.out.println(u.getGender());
		System.out.println(u.getMobile());
		
	}
	else {
		System.out.println("user id not found");
	}
}

}
