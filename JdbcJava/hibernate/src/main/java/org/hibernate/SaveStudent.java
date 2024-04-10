package org.hibernate;

import org.hibernate.cfg.Configuration;

public class SaveStudent {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		student s = new student();
		s.setId(1);
		s.setAge(22);
		s.setName("pavan");
		session.save(s);
		tran.commit();

	}
}
