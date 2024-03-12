package com.queueDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	//	def cap-16
    //increase by power of 2
		//maintain the insertion order
		ArrayDeque<Book> adq=new ArrayDeque<>();
		 adq.add(new Book(1,"secret",900));
		 adq.add(new Book(2,"Hamlet",750));
		 adq.add(new Book(3,"life",1000));
		 adq.add(new Book(4,"power of mind",820));
		 //addlast()exliciplity throw pointer exception while overridding method
		 //adq.add(null)
		 System.out.println(adq);
		 for(Book b:adq) {
			 System.out.println(b);
		 }
		 System.out.println("----------------");
		 System.out.println(adq.removeLast());
		 System.out.println("---------------");
		 for(Book b:adq) {
			 System.out.println(b);
		 }
		 
}
}
