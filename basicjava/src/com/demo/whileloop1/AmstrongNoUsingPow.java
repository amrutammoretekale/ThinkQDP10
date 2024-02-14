package com.demo.whileloop1;

import java.util.Scanner;

public class AmstrongNoUsingPow {
	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
	     }return count;
	}
	public static int power(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p*=base;//p=p*base;
			}return p;
	}
	
	public static boolean amstrongno(int num) {
		int pow=countDigit(num);
		int orignal=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow);//sum=sum+rem*rem*rem;
			num/=10;               //sum=su+math.pow(rem,pow1)
			}
		return orignal==sum;
				
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		 int base = 1,pow = 1;
		System.out.println("Enter number");
		num=sc.nextInt();
		countDigit(num);
		 power( base,pow);
		 boolean status=amstrongno(num);
		 if(status)
			 System.out.println("Amstrong");
		 else
			 System.out.println(" not Amstrong");
	}

}
