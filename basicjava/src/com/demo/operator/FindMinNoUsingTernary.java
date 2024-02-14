package com.demo.operator;

import java.util.Scanner;

public class FindMinNoUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	       
	       int n1,n2,min;
	       
	       System.out.println("Enter num1");
	       n1=sc.nextInt();
	       System.out.println("Enter num2");
	       n2=sc.nextInt();
	       
	       min=n1<n2?n1:n2;
	       
	       System.out.println("min:"+min);
	       
	}

}
