package com.demo.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       int n1,n2,max;
       
       System.out.println("Enter num1");
       n1=sc.nextInt();
       System.out.println("Enter num2");
       n2=sc.nextInt();
       
       max=n1>n2?n1:n2;
       
       System.out.println("max:"+max);
       
	}

}
