package com.while_Loop;

import java.util.Scanner;

public class AmstrongNo {
	public static void checkAmstrongNo(int num) {
		int rem,sum=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is amstrong number");
		else
			System.out.println(temp+" is not amstrong number");
	}
	
	public static void main(String[] args) {
		int num=153;
		checkAmstrongNo(num) ;

	}

}
