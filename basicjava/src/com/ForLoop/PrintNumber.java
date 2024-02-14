package com.ForLoop;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int i,num;
      num=sc.nextInt();
      for(i=0;i>=num;i++) {
    	  System.out.println(i);
      }
	}

}
