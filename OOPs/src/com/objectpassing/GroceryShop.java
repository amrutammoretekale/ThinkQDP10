package com.objectpassing;

import java.util.Scanner;
  
public class GroceryShop {
	static Scanner sc=new Scanner(System.in);
	public static void enterItemDetails(Item i) {
		System.out.println("Enter id of item");
		i.setItemid(sc.nextInt());
		
		System.out.println("Enter name of item");
		i.setIname(sc.next());
		
		System.out.println("Enter item cost");
		i.setIcost(sc.nextDouble());
		
		System.out.println("Enter qty");
		i.setQty(sc.nextInt());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1=new Item();
		enterItemDetails(i1);
		
		Item i2=new Item();
		enterItemDetails(i2);
		
		
		System.out.println("Enter the discount on groceryshop:");
//		double disc= sc.nextDouble();
		System.out.println("-----------------------------");
		System.out.println(i1);
		System.out.println("Amount to pay:"+i1. calDisscountprice(10));
		System.out.println(i2);
		System.out.println("Amount to pay:"+i2. calDisscountprice(20));
		
	  
		i1.compareCost(i2);

	}

}
