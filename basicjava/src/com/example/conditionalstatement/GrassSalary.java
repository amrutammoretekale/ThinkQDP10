package com.example.conditionalstatement;

import java.util.Scanner;

public class GrassSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   double salary,hra,da;
   System.out.println("Enter your salary");
   salary=sc.nextDouble();
   if(salary <= 10000) {
	   hra=salary/20;
	   da=salary/80;
	   System.out.println("your salary is: " +salary  );
   }
	}

}
