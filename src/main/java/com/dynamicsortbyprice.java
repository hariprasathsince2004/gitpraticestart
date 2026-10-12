package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.*;

public class dynamicsortbyprice {
	static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	System.out.println("ENTER the order 1 for ascending 2 for descending");
	int order = sc.nextInt();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	EntityManager em = emf.createEntityManager();
	if(order==1)
	{
		Query q = em.createQuery("select p from product p order by p.price ");
		List<product> list = q.getResultList();
		for(product p :list)
		{
			System.out.println(p);
		}
	}
	else if(order==2)
	{
		Query q = em.createQuery("select p from product p order by p.price desc");
	    List<product> list = q.getResultList();
	    for(product p :list)
	    {
	    	System.out.println(p);
	    }
	}
	else {
		System.out.println("invalid input ");
	}
	
}
}
