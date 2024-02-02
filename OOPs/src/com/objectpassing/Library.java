package com.objectpassing;

import java.util.Scanner;

//Task2: Create a library of books , Count the number of books added in the library. 
//All the books have a common supplier "Mr XYZ" 
//Show the details of library as:
//Supplier name:
//Total books:
//Book details

public class Library {
	static Scanner sc=new Scanner(System.in);
       int id;
	   static String name;
       private static  int count;
       static String suppilername;
       {
    	   count++;
       }
         
       Library(){
		System.out.println("suppiler name mrs XYZ");
	    }
       public void setId(int id) {
    	   this.id=id;
       }
       public int getId() {
    	   return id;
       }
       public void setName(String name) {
    	   this.name=name;
       }
       public String getName() {
    	   return name;
       }
       public static void showDetails(Library b) {
    	   System.out.println("Enter book id");
    	   b.setId(sc.nextInt());
    	   System.out.println("Enter book name");
    	   b.setName(sc.next());
    	  
       }
	
	
	

   public static void main (String args[]) {
	      Library b1=new Library();
	      showDetails(b1);
	      Library b2=new Library();
	      showDetails(b2);
	      System.out.println("count:"+count);
	    
	
  }
}