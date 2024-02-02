package com.objectpassing;

import java.util.Scanner;

public class TestBook {
	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetials(Book b) {
		System.out.println("Enter book id");
		b.setId(sc.nextInt());
		System.out.println("enter book name");
		b.setName(sc.next());
		System.out.println("Enter book price");
		b.setPrice(sc.nextDouble());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		enterBookDetials(b1);

		Book b2 = new Book();
		enterBookDetials(b2);

		System.out.println("-----------------------------");
		System.out.println(b1);
		System.out.println("Amount to pay:" + b1.calDiscount(25));
		System.out.println(b2);
		System.out.println("Amount to pay:" + b2.calDiscount(20));

		b1.comparePrice(b2);

	}

}
