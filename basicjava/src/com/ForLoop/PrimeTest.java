package com.ForLoop;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 int num,i,n=1;
 boolean flag=false;
  System.out.println("Enter the number");
  num=sc.nextInt();
  if(num==0 || num==1) {
	  flag=true;
	  
  }else {
	  for(i=2;i<=num/2;i++) {
		  if(num%i==0) {
			  flag=true;
			  break;
		  }
	  }//end loop
  }
  if(flag == false) {
	  System.out.println(n+" is prime number");
  }
	}

}
