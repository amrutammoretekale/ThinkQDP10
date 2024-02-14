package com.IfElse;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n1,n2,n3;
     System.out.println("Enter Frist Number");
     n1=sc.nextInt();
     
     System.out.println("Enter second number");
     n2=sc.nextInt();
     
     System.out.println("Enter Thrid number");
     n3=sc.nextInt();
     if(n1>n2 && n1>n3) {
    	 System.out.println(n1+" is greater");
     }else if(n2>n1 && n2>n3);{
    	 System.out.println(n2+" is greater");
     }
     }

}
