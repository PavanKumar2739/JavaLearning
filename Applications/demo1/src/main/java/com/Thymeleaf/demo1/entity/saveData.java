package com.Thymeleaf.demo1.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class saveData {
    ans a=new ans();
	a.setAns("programming language");
	a.setId(1);
	
	questions q=new questions();
	q.setId(1);
	q.setSub("java");
//	public static void main(String[] args) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction tran=manager.getTransaction();
//		
//		questions q=new questions();
//		q.setId(1);
//		q.setSub("java");
//		
//		ans a=new ans();
//		a.setAns("java isprogramming language");
//		a.setId(1);
//
//	}
}

