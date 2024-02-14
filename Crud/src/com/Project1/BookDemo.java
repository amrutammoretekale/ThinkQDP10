package com.Project1;

import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book b[]=new Book[5];
		int id,price;
		String bname,aname;
		 int count=0;
		do
		{
			   System.out.println("1.Add Book");
			   System.out.println("2.Update Book");
			   System.out.println("3.Delete Book");
			   System.out.println("4.Search Book");
			   System.out.println("5.Show ALL  Books");
			   System.out.println("6.Exit");
			   
			   System.out.println("Enter choice");
			   int choice=sc.nextInt();
			  
			   switch(choice)
			   {
			   case 1:
				   System.out.println("Add Book");
				   System.out.println("Enter number of books");
				   int size=sc.nextInt();
				   for(int i=0;i<size;i++)
				   {
					   System.out.println("Enter book id");
					    id=sc.nextInt();
					   System.out.println("Enter book name");
					   bname=sc.next();
					   System.out.println("Enter book author");
					   aname=sc.next();
					   System.out.println("Enter book price");
					   price=sc.nextInt();
					   b[count]=new Book(id,bname,aname,price);
					   count++;
					   
				   }
				   break;
			   case 2:
				   System.out.println("Update Book");
				   System.out.println("Enter book id you want to update");
				   id=sc.nextInt();
				   for(int i=0;i<count;i++)
				   {
					   if( b[i]!=null && b[i].getBookId()==id)
					   {
						  System.out.println("Enter price you want to update");
						  price=sc.nextInt();
						  b[i].setPrice(price);
						  
						  
					   }
				   }
				   System.out.println("succesfully Updated");
				   break;
				   
				   
			   case 3:
				   System.out.println("Delete Book");
				   System.out.println("Enter the bookid you want to delete");
				   id=sc.nextInt();
				   for(int i=0;i<count;i++)
				   {
					   if(b[i].getBookId()==id)
					   {
						   b[i]=null;
					   }
				   }
				   System.out.println("Book deleted Successfully");
				   break;
			   case 5:
				   System.out.println("Show ALL  Books");
				   
				   for(int i=0;i<count;i++)
				   {
					   if(b[i]!=null)
					   {
					   System.out.println(b[i]);
					   }
				   }
				   break;
				   
			   case 6:
				   
				  System.exit(0);
				  break;
			   }
		}while(true);
		

	}

}


