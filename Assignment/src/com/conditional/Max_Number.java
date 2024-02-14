package com.conditional;
//WAP to find maximum number between two numbers 
import java.util.Scanner;

public class Max_Number {

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 int n1,n2;
 System.out.println("Enter frist the number");
 n1=sc.nextInt();
 System.out.println("Enter the seond number");
 n2=sc.nextInt();
 if(n1>n2) {
	 System.out.println(n1+" is greater");
 }else {
	 System.out.println(n2+ " is greater");
 }
	 
	}

}
