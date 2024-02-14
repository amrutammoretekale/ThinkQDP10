package com.ForLoop;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
    int i,num,power;
    long res=1;
    System.out.println("Enter number");
    num=sc.nextInt();
    System.out.println("Enter power");
    power=sc.nextInt();
    for(i=1;i<=power;i++) {
    	res=res*power;
    	
    }
    System.out.println("Result:"+res);
	}

}
