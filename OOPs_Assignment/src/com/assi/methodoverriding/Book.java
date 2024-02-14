package com.assi.methodoverriding;
//1) WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook()
//differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()
class Kid{
	protected int id;
	protected String name;
	
	void readBook(int id) {
		System.out.println("id:"+id);
	}
	void readBook(int id,String name ) {
		System.out.println("id:"+id+" "+"name:"+name);
	}
	
		
	}

class BigKid extends Kid{
	protected int id;
	protected String name;
	
	void readBook(int id) {
		System.out.println("id:"+id);
	}
	void readBook(int id,String name ) {
		System.out.println("id:"+id+" "+"name:"+name);
	}
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k1=new Kid();
		k1.readBook(1,"Arnav");
		
		BigKid b1=new BigKid();
		b1.readBook(1);
		b1.readBook(2,"Arnavi");

	}

}
