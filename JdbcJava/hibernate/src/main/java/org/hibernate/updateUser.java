package org.hibernate;

import org.hibernate.cfg.Configuration;

public class updateUser {

	public static void main(String[] args) {
		Configuration config =new Configuration().configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tran=session.beginTransaction();
		user u=new user();
		u.setAge(23);;
		u.setGender('M');
		u.setId(1);
		u.setMobile(876776766);
		u.setName("pavan");
		session.update(u);
		tran.commit();
	}

}
