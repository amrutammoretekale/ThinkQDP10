package com.Project1;

import java.util.Scanner;

public class BookImplementation implements BookDetails {
	Scanner sc = new Scanner(System.in);
	Book[] b = new Book[5];
	int id, price;
	int count = 0;
	String aname, bname;

	@Override
	public void addBook() {
		System.out.println("Add Book");
		System.out.println("Enter number of books");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter book id");
			id = sc.nextInt();
			System.out.println("Enter book name");
			bname = sc.next();
			System.out.println("Enter book author");
			aname = sc.next();
			System.out.println("Enter book price");
			price = sc.nextInt();
			b[count] = new Book(id, bname, aname, price);
			count++;

		}
	}

	@Override
	public void updateBook() {
		System.out.println("Update Book");
		System.out.println("Enter book id you want to update");
		id = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (b[i] != null && b[i].getBookId() == id) {
				System.out.println("Enter price you want to update");
				price = sc.nextInt();
				b[i].setPrice(price);

			}
		}
		System.out.println("succesfully Updated");
	}

	@Override
	public void deleteBook() {
		System.out.println("Delete Book");
		System.out.println("Enter the bookid you want to delete");
		id = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (b[i].getBookId() == id) {
				b[i] = null;
			}
		}
		System.out.println("Book deleted Successfully");
	}
	@Override
	public void searchBook() {
		System.out.println("search by name");
		System.out.println("Enter Book name");
		String bname=sc.next();
		for(int i=0;i<count;i++) {
			if(b[i]!=null && b[i].getBookname().equalsIgnoreCase(bname)) {
				System.out.println(b[i]);
			}
			else
			{
				System.out.println("Book name not found");
			}
			break;
		}
		
	}


	@Override
	public void showAllBook() {
		System.out.println("Show ALL  Books");

		for (int i = 0; i < count; i++) {
			if (b[i] != null) {
				System.out.println(b[i]);
			}
		}
	}

	@Override
	public void exit() {
		System.exit(0);

	}

	
}
