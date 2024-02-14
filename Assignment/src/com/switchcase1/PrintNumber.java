package com.switchcase1;

import java.util.Scanner;

//7. Write a Java program to enter number between 1 to 5 and print it in word
public class PrintNumber {
public static int printnumber(int num) {
	int choice= 0;
	switch(choice) {
	default: System.out.println(" default");
	case 1:System.out.println("one");
	break;
	case 2:System.out.println("two");
	
	case 3:System.out.println("three");
	
	case 4:System.out.println("four");
	
	case 5: System.out.println("five");
	
	}return num;
}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int number=printnumber(num);
	    System.out.println(num);
		
		
	}

}
