package com.ForLoop1;

import java.util.Scanner;

//6.Write a Java program to find sum of all even numbers between 1 to n. 
public class FindSumOfEvenNo {
	public static int printevnno(int n1) {
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter number");
		n=sc.nextInt();
		
		for(i=2;i<=n;i++) {
			if(i%2==0) 
				sum=sum+i;
				System.out.println("sum:"+sum);
		}return sum;
				
	} 

	public static void main(String[] args) {
		 int n1 = 1;
		printevnno(n1);
			
		}
	

	}


