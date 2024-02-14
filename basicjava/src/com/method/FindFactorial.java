package com.method;

import java.util.Scanner;

// WAP to  take any  number from user and find the factorial 
// WAP to print factorial of numbers from 1 t0 10
public class FindFactorial {
      
	 public static int findFact(int n) {
		 int i;
		 int fact=1;
		 for(i=1;i<=10;i++) {
			 fact=fact*i;
			 }
		  return fact;
	 }
		 // find n number of factorial
		  public static void printfactorial(int n) {
			  int i;
			  for(i=1;i<=n;i++) {
				  System.out.println(i+"!="+findFact(i));
			  }
		  } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    int fact=findFact(num);
    System.out.println(num+"!="+fact);
    printfactorial(10);
	}

}
