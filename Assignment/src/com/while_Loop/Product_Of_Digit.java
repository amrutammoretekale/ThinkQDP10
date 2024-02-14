package com.while_Loop;
//WAP to calculate product of digit in any number
import java.util.Scanner;

public class Product_Of_Digit {
	public static void perfectno(int num) {
		 Scanner sc=new Scanner(System.in);
	        int product=1,rem;
	        System.out.println("Enter the number");
	        num=sc.nextInt();//456
	        while(num!=0) {
	        	
	        	product=product*(num%10);
	        	num=num/10;
	        }
	        System.out.println("product:" +product);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num=1;
		perfectno(num) ;

		
	}
}
