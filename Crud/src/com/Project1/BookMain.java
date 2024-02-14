package com.Project1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[5];
		int id, price;
		String bname, aname;
		int count = 0;
		BookDetails bk = new BookImplementation();
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search Book");
			System.out.println("5.Show ALL  Books");
			System.out.println("6.Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				bk.addBook();
				break;
			case 2:
				bk.updateBook();
				break;
			case 4:
				bk.searchBook();

			case 3:
				bk.deleteBook();
				break;
			case 5:
				bk.showAllBook();
				break;

			case 6:

				bk.exit();
				break;
			}
		} while (true);

	}

}
