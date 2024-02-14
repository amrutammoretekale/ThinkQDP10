package com.conditional;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double bs,gs,da,hra;
		System.out.println("enter basic salary");
		bs=sc.nextDouble();
		
		  if(bs>=10000) {
			  da=bs*0.2;
		     hra=bs*0.8;
		     gs=bs+da+hra;
        	System.out.println("gross salary:"+gs);
		  }
        	else if(bs<=20000) {
        		  da=bs*0.25;
     		     hra=bs*0.9;
     		     gs=bs+da+hra;
     		    System.out.println("gross salary:"+gs);
     		 
        	}else if(bs>20000) {
      		  da=bs*0.35;
   		     hra=bs*0.95;
   		     gs=bs+da+hra;
   		    System.out.println("gross salary:"+gs);
        	}	
	}

}
