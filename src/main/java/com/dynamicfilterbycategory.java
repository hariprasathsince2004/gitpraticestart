package com;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class dynamicfilterbycategory {
	static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
	   System.out.println("enter the product category");
	   String cat = sc.next();
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	   EntityManager em = emf.createEntityManager();
	   	Query q = em.createQuery("select p from product p where p.category = :cat");
	   	q.setParameter("cat", cat);
	   	List <product> list = q.getResultList();
	   	for(product p :list)
	   	{
	   		System.out.println(p);
	   	}
	 
}
}
