package com.ForLoop1;

import java.util.Scanner;

public class SumOfNaturalNo {
   public static int natural(int num) {
	   Scanner sc=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter n number");
		
		n=sc.nextInt();
	    for(i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		return sum;

   }
	public static void main(String[] args) {
		int n = 1;
		int res=natural(n);
		System.out.println("res:"+res);

	}

}
