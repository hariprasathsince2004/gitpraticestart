package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.*;

public class sortproductbyrating {
	static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("enter 1 for ascending 2 for descending");
	int option = sc.nextInt();
	if(option==1)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from product p order by p.rating");
		List<product> p = q.getResultList();
		for(product s:p)
		{
			System.out.println(s);
		}
		
	}
	else if(option==2)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from product p order by p.rating desc");
		List<product> list = q.getResultList();
		for(product p:list)
		{
			System.out.println(p);
		}
	}
	else{
		{
			System.out.println("invalid input ");
		}
	}
}
}
