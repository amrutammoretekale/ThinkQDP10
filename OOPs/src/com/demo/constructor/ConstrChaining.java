package com.demo.constructor;
class Book{
	protected int id;
	protected String name;
	Book(){
		
	}
	Book(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}
}
class TextBook extends Book{
	private String bookname;
	private double cost;
	
	TextBook(){
		
	}
	TextBook(int id,String name,String bookname,double cost){
		super(id,name);
		this.bookname=bookname;
		this.cost=cost;
	}
	public void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("bookname:"+bookname);
		System.out.println("cost:"+cost);
		
	}
}
public class ConstrChaining {

	public static void main(String[] args) {
		Book b1=new Book(101,"Classmete");
		b1.display();
		System.out.println("-----------------------");
		TextBook t1=new TextBook(101,"Classment","Marathi",152);
		t1.display();

	}

}
