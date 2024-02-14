package com.while_loop;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int gnum,num=15;
  
  while(true) {
	  System.out.println("Enter the number");
	  gnum=sc.nextInt();
	  if(gnum>num) 
		  System.out.println("Too high!! Enter the lower number");
	 else if(gnum<num)
		 System.out.println("Too low!! Enter the higher number" );
	 else if(gnum==num) {
		 System.out.println("congo!! you guessed correct number");
	 break;}
  }
	}

}
