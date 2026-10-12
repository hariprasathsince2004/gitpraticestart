package com;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class saveproduct {
	public static void main(String[]args)
	{
		product p = new product();
		p.setid(8);
		p.setproductname("strawberry");
		p.setcategory("fruit");
		p.setprice(50.0);
		p.setrating(10);
		p.setstock(10);
  
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	em.persist(p);
	et.commit();
}}
