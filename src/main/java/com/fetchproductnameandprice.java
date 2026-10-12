package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class fetchproductnameandprice {
	public static void main(String[]args)
	{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p.productname,p.price,p.category from product p");
	List<Object[]> list = q.getResultList();
	
	for(Object[] arr :list)
	{
		System.out.println("productname ="+ arr[0] + ",price"+arr[1]+", category=" +arr[2]);
	}
}}
