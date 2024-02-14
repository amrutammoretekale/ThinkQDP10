package com.demo.nested_if_else;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
    	 int age,weight;
    	 System.out.println("Enter age");
    	 age=sc.nextInt();
    	 
    	 if(age>=18) {
    		 System.out.println("Enter weight");
    		 weight=sc.nextInt();
    		 if(weight>50) 
    			 System.out.println("your age and weight are valid for blood donation");
    		 
    	     else 
    		 System.out.println("your weight is not valid for blood donation");
    	 
    		}else
    	 System.out.println("your age is not valid for blood donate as below 18");
		} 
	}

