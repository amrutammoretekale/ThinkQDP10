package com.SwitchCase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     char oprator;
     double n1,n2,res;
     System.out.println("choose an operaator");
     oprator=sc.next().charAt(0);
     System.out.println("Enter Frist Number");
     n1=sc.nextDouble();
     System.out.println("Enter secnd number");
     n2=sc.nextDouble();
    
     switch(oprator){
     case '+' :
    	 res = n1 + n2 ;
    	 System.out.println(n1+ '+' +n2+ '='+res);
         break;
     case  '-':
    	 res=n1-n2;
    	 System.out.println(n1+ '-' +n2+ '=' +res);
    	 break;
     case  '*':
    	 res=n1*n2;
    	 System.out.println(n1+ '*' +n2+ '=' +res);
    	 break;
     case  '/':
    	 res=n1/n2;
    	 System.out.println(n1+ '/' +n2+ '=' +res);
    	 break;
    default:
    	System.out.println("invalid oprator");
    	break;
    	 
     }
	}

}
