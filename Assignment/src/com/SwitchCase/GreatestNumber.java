package com.SwitchCase;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner("System.in");
  int n1,n2,res;
 System.out.println("Enter Frist number:");
 n1=sc.nextInt();
 System.out.println("Enter Second number");
 n2=sc.nextInt();
 res=n1>n2?1:2;
 switch(res){
	 case 1:
		 System.out.println(n1+ "is greater");
		 break;
	 case 2:
		 System.out.println(n2+ "is greater");
		 break;
		 default:
			 break;
 }
	}

}
