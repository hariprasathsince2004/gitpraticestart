package com;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.Scanner;
public class increasedecrease {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[]args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("product");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("enter option 1 for increase 2 for decrease");
		int option = sc.nextInt();
		if(option == 1)
		{
			System.out.println("enter the product id ");
			int id = sc.nextInt();
			System.out.println("enter how much increase");
			int increase = sc.nextInt();
			product p = em.find(product.class, id);
			if(p!=null)
			{
			p.setstock(p.getstock()+increase);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("sucessfully increased stock");
			return;
			
			}
			else {
				System.out.println("data not found");
			}
		}
		else if(option == 2)
		{
			System.out.println("enter the product id ");
			int id = sc.nextInt();
			System.out.println("enter how much decrease");
			int decrease = sc.nextInt();
			Query q = em.createQuery("select p.stock from product p where p.id =:id");
			q.setParameter("id", id);
			int stock =(int) q.getSingleResult();
			if(stock<decrease)
			{
				System.out.println("stock lesser than decrease so not possible");
				return;
				
			}
			product p = em.find(product.class, id);
			if(p!=null)
			{
			p.setstock(p.getstock()-decrease);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("sucessfully decreased stock");
			return;
			}
			else {
				System.out.println("data not found");
			}
		}
		else {
			
		System.out.println("invalid input");
		
		
	}
}}
