package com.demo.whileloop;

import java.util.Scanner;

public class MultiplicationOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num,ans=1;
System.out.println("Enter the number");
num=sc.nextInt();
while(num!=0) {
	ans*=(num%10);
	num/=10;
}
System.out.println("multiplication"+ans);

	}

}
