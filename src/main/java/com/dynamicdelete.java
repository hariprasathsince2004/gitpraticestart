package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class dynamicdelete {
	static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
	   System.out.println("enter the product id");
	   int id = sc.nextInt();
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction et = em.getTransaction();
	   et.begin();
	 product p =   em.find(product.class, id);
	   em.remove(p);
	   et.commit();
	   System.out.println("sucessfully deleted");
	   
	 
}
}
