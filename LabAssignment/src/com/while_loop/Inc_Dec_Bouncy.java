package com.while_loop;

import java.util.Scanner;

public class Inc_Dec_Bouncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      boolean inc=false,dec=false;
      int num,rem1,rem2;
      System.out.println("Enter the number");
      num=sc.nextInt();//5678
      while(num>10) {
    	  rem1=num%10;//8
    	  //System.out.println(rem1);
    	  num/=10;//567
    	  rem2=num%10;//7
    	  //System.out.println(rem2);
    	  if(rem1>rem2) {
    		  inc=true;
    	  }else if(rem1<rem2) {
    		  dec=true;
    	  }
    	//  System.out.println(num);
    	//  System.out.println(inc);
    	 // System.out.println(dec);

      }
      if(inc==dec) {
    	  System.out.println("bouncy");
      }else
    	  System.out.println("not bouncy");

	}

}
