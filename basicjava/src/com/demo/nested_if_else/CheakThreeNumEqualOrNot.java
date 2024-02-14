package com.demo.nested_if_else;

import java.util.Scanner;

//4.Check if three numbers are equal or not
public class CheakThreeNumEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter the num1");
		n1=sc.nextInt();
		System.out.println("Enter the num2");
		n2=sc.nextInt();
		System.out.println("Enter the num3");
		n3=sc.nextInt();
		if(n1==n2) {
			
		if(n1==n3) 
			System.out.println("equal ");
		
		else //(n1!=n2)
			System.out.println(" not equal  ");
		}
		else //(n1!=n3)
		  
			System.out.println(" not equal");
			
		
	}

}
