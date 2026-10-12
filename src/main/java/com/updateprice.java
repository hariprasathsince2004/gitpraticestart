package com;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.Scanner;


public class updateprice {
	 static Scanner sc = new Scanner(System.in);
  public static void main(String[]args)
  {
	  System.out.println("enter the product id");
	  int id = sc.nextInt();
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	  product p = em.find(product.class,id);
	  if(p!=null)
	  {
		  System.out.println("enter the price");
		  Double price= sc.nextDouble();
		  p.setprice(price);
		  et.begin();
		  em.merge(p);
		  et.commit();
		  System.out.println("sucessfully inserted");
	  }
	  else {System.out.println("data not found");}
  }
}
