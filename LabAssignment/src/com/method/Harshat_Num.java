package com.method;

import java.util.Scanner;

public class Harshat_Num {
  public static boolean harshat(int num) {
	  int rem,sum=0;
	  int orignal=num;
	  while(num!=0) {
		  rem=num%10;
		  sum=sum+rem;
		  num=num/10;
		  }
	  if(orignal%sum==0) {
		  return true;
	  }else {
		  return false;
	  }
		 
		  }
	  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      System.out.println("enter number");
     
      boolean harshat=harshat(num);
     
	}

}
