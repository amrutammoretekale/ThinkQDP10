package com.while_Loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num, i=1 ,sum=0;
System.out.println("Enter number");
num=sc.nextInt();
while(i<num) {
	if(num%i==0)
	{
		sum+=i;
	}
	i++;
}
if(num==sum) {
	System.out.println(num+" is perfect number");
	
}else
	System.out.println(num+ " is not perfect number");
	}


}

