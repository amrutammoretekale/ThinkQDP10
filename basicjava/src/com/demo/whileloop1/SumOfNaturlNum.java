package com.demo.whileloop1;

import java.util.Scanner;

public class SumOfNaturlNum {
	public static void NaturlNo(int n) {
		int i=1,sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		NaturlNo(num);
				

	}

}
