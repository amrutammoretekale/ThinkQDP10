package com.method;

import java.util.Scanner;

public class PerfectNumberTest {
  public static double avg(double x,double y,double z) {
	  return(x+y+z)/3;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the first number:");
     double x=sc.nextDouble();
   
     System.out.println("Enter the second number:");
     double y=sc.nextDouble();
     
     System.out.println("Enter the third number:");
     double z=sc.nextDouble();
     System.out.println("Avarage:"+avg(x,y,z));
	}

}
