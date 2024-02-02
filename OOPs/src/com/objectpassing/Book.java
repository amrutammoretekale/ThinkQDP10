package com.objectpassing;

//Task1: Create a class Book with the following details : id, name , price, category
//Create  methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of 
//any 2 books
public class Book {
	private int id;
	private String name;
	private double price, cost;
	private double discprice;
	private String category;
	private int qty;

	Book() {

	}

	Book(int id, String name, Double price, double discprice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discprice = discprice;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getprice() {
		return price;
	}

	public double calDiscount(double disc) {
	
		discprice = price-((price*disc)/100);
		return discprice;
	}

	public void comparePrice(Book b2) {

		if (this.discprice == b2.discprice)
			System.out.println("Both have same cost..");
		else if (this.discprice > b2.discprice)
			System.out.println(this.getName() + " has higher cost");
		else
			System.out.println(b2.getName() + " has higher cost");
	}

	public String toString() {
		return "id:" + id + " " + "name:" + name + " " + "price:" + price + " " + calDiscount(price);
	}

}
