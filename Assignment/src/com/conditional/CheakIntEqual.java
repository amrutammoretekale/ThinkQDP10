package com.conditional;

import java.util.Scanner;

public class CheakIntEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10,b=15;
		 if(a==b) {
			 System.out.println(a+" is eqaul to"+b);
		 }else {
			 System.out.println(a+ " is not equal to "+b);
		 }*/
		 Scanner sc=new Scanner(System.in);
		 int n1,n2;
		 System.out.println("Enter frist the number");
		 n1=sc.nextInt();
		 System.out.println("Enter the seond number");
		 n2=sc.nextInt();
		 if(n1==n2) {
			 System.out.println(n1+" is eqaul to"+n2);
		 }else {
			 System.out.println(n1+ " is not equal to "+n2);
	}
	}
}
