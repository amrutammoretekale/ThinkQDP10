package com.example.conditionalstatement;

import java.util.Scanner;

public class PrizeTest {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter to get a prize");
		num=sc.nextInt();
		
		if(num>=1 && num<=3) {
		  System.out.println("Congo!!! you got a mobile");	
		}
		else if(num>=4 && num<=6)
		{
			System.out.println("Congo!!! you got a Laptop");	
		}
		else if(num>=7 && num<=10)
		{
			System.out.println("Congo!!! you got a book");	
		}
		else
		{
			System.out.println("Sorry!!! better luck next time");	
		}
		
	}

}
