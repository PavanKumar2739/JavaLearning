package com.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Hospital;



public class hospitalDao {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction tran=manager.getTransaction();
	public Hospital saveUser(Hospital h) {
		manager.persist(h);
		tran.begin();
		tran.commit();
		return h;
	}
}
