package com.demo.nested_if_else;
// check number is even and divisible by 6 or not and check number odd and 
// divisible by 5 or not;
import java.util.Scanner;

public class checkEvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num;
     System.out.println("Enter number");
     num=sc.nextInt();
     if(num%2==0){
    	  System.out.println(num+" number is even");
        if(num%6==0)
        	System.out.println(num+" is divisible by 6 and 2");
        else
        	System.out.println(num+" is not divisible by 6 and 2");
    	 }
       else {
          System.out.println(num+"number is odd");
           if(num%5==0)
         System.out.println(num+" is divisible by 5"); 
          else
    	  System.out.println(num+" is not divisible by 5");
    	  }
    		 
     }
	
}

