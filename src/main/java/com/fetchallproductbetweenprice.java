package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.*;

public class fetchallproductbetweenprice {
	static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("enter the start price");
	double stprice = sc.nextDouble();
	System.out.println("enter the end price");
	double endprice = sc.nextDouble();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p from product p where p.price between :stprice AND :endprice");
	q.setParameter("stprice", stprice);
	q.setParameter("endprice", endprice);
	List <product> list = q.getResultList();
	for(product p : list)
	{
		System.out.println(p);
	}
}
}
