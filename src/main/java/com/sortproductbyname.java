package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.*;

public class sortproductbyname {
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
	System.out.println("enter 1 for ascendingname 2 for descendingname");
	int option = sc.nextInt();
	if(option==1)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from product p order by p.productname");
		List<product> p = q.getResultList();
		for(product ps :p)
		{
			System.out.println(ps);
		}
		
	}
	else if(option==2)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from product p order by p.productname desc");
		List<product> p = q.getResultList();
		for(product ps :p)
		{
			System.out.println(ps);
		}
	}
	else
	{
		System.out.println("invalid input");
	}
}
}
