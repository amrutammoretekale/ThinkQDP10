package com.conditional;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     float da,hra;
     float grosssalary, basicsalary ;
     System.out.println("basic salary");
     basicsalary=sc.nextInt();
     System.out.println("Enter da");
     da=sc.nextInt();
     System.out.println("Enter hra");
     hra=sc.nextInt();
     da=(da*basicsalary)/100;
     hra=(hra*basicsalary)/100;
     grosssalary=basicsalary+da+hra;
     System.out.println("grosssalary of employee:"+grosssalary);
     
   
    
    
	}

}
