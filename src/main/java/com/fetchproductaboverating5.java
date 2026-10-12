package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.*;

public class fetchproductaboverating5 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the rating ");
		int rate = sc.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from product p where p.rating > :rate");
		q.setParameter("rate", rate);
		List<product> ps = q.getResultList();
		for(product p :ps)
		{
			System.out.println(p);
		}
	}
}
