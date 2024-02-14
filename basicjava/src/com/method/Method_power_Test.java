package com.method;

import java.util.Scanner;

public class Method_power_Test {
    public static int square(int n) {
    	return n*n;
    }
    public static int cube(int n) {
    	return n*n*n;
    }
    public static void showCubes(int range) {
    	int i;
    	for(i=1;i<=range;i++) {
    		System.out.println(i+"="+cube(i));
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number");
   int num=sc.nextInt();
   
   System.out.println("square:" +square(num));
   System.out.println("cube:" +cube(num));
   showCubes(num);
	}

}
