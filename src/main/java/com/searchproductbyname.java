package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class searchproductbyname {
	static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
	
	 System.out.println("enter the product name");
	 String pname = sc.next();
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	 EntityManager em = emf.createEntityManager();
	 Query q = em.createQuery("select p from product p where p.productname = :pname");
	 q.setParameter("pname", pname);
	 product p = (product)q.getSingleResult();
	 if(p!=null) {
	 System.out.println(p);
	 }
	 else {
		 System.out.println("PRODUCT NOT FOUND");
	 }
	 
	 
}
}
