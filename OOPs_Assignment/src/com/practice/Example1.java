package com.practice;
//can we override static method
class Book {
	 int id;
	 String name;
	Book(){
		
	}
	Book(int id,String name){
		this.id=id;
		this.name=name;
	}
	static void display() {
		Book b=new Book();
		System.out.println(b.id+" "+b.name);
	}
}
class textBook extends Book{
	int tid;
	String tname;
	textBook(){
		
	}
	textBook(int tid,String tname){
		this.tid=tid;
		this.tname=tname;
	}
	//@Override
static void display() {
	
	textBook t=new textBook();
	System.out.println(t.tid+" "+t.tname);
}
}
public class Example1 {

	public static void main(String[] args) {
		Book B1=new Book(); 
			B1.display();
	    textBook T1=new textBook();
	     T1.display();

	}

}
