package com.example.conditionalstatement;

import java.util.Scanner;

public class CheckEvenOrOddUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num;
     System.out.println("Enter number");
     num=sc.nextInt();
     if(num%2==0) {
    	 System.out.println(num+" is even number");
     }
     else {
    	 System.out.println(num+" is odd number");
     }
	}

}
