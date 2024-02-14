package com.demo.nested_if_else;

import java.util.Scanner;

//.WAP to check whether it is divisible by 7 or not. if it is not divisible by 7 
//then which no 
//should be added in given number so number becomes divsible by 7
//eg 25 is not divisible by 7, add 3 to make number divisble by 7 
public class checkDivisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num,add;
        System.out.println("Enter number");
        num=sc.nextInt();
        if(num%7==0)
        	System.out.println(num+" is divisible by 7");
        else
        	System.out.println("add extra number you want to add");
             add=sc.nextInt();
             num=num+add;
        	if(num%7==0)
        		System.out.println(num+" is divisible by 7");
          
	}

}
