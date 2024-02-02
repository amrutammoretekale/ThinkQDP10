package com.objectpassing;

public class Item1 {

	private int itemid;
	private String iname;
	private double cost;
		
	//static double discount=0.1;
		
	static double discount;
	static String brand;
	static int icount=0;
	
	static
	{
		System.out.println("My grocery shop...");
		// called once 
//		System.out.println("Item added..");
//		icount++;
	}
	
	static
	{
		System.out.println("Discount on all items:");
		discount=0.1;
	    brand="Patanjali";
	}
	
	{
		System.out.println("In instance block");
		brand="Nestle";
		System.out.println("Item added..");
		icount++;
	}
	Item1()
	{
		brand="Saffola";
		
	}
	public String toString()
	{
		return "Item:"+itemid+" "+iname+" "+cost;
	}
}
	
	
