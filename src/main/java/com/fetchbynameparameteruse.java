package com;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchbynameparameteruse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
     System.out.println("enter the product name");
     String pname = sc.next();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p from product p where p.productname =?1");
	q.setParameter(1, pname);
	List<product> list = q.getResultList();
	for(product p :list)
	{
		System.out.println(p);
	}
	
}}
