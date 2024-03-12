package com.queueDemo;

import java.util.PriorityQueue;

public class Library {
 public static void main(String args[]) {
	 PriorityQueue<Book> bpq=new PriorityQueue<>();
	 bpq.add(new Book(1,"secret",900));
	 bpq.add(new Book(2,"Hamlet",750));
	 bpq.add(new Book(3,"life",1000));
	 bpq.add(new Book(4,"power of mind",820));
	 
	 System.out.println(bpq);
	 for(Book b:bpq) {
		 System.out.println(b);
	 }
}
}
