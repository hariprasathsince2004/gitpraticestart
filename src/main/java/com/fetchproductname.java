package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchproductname {
	public static void main(String[]args)
	{
  EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
  EntityManager em = emf.createEntityManager();
  Query q = em.createQuery("select p.productname from product p");
  
  List<String> productnames = q.getResultList();
  System.out.println(productnames);
  
}}
