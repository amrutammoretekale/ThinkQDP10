package com.method;

import java.util.Scanner;

public class FindCube {
    public static int FindCube(int num) {
    	return num*num*num;
    }
    public static int Findsqr(int num) {
    	return num*num;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int num = sc.nextInt();
      int n=FindCube(num);
      System.out.println(n);
      int n1=Findsqr(num);
      System.out.println(n1);
	}

}
