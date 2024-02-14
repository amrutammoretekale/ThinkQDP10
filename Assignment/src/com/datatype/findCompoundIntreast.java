package com.datatype;

import java.util.Scanner;

//7. Write a Java program to enter P, T, R and calculate Compound Interest
public class findCompoundIntreast {

	public static void main(String[] args, Object math) {
	Scanner sc=new Scanner(System.in);
	int P,T,R,CI,A,n,t;
	System.out.println("Enter P");
	P=sc.nextInt();
	System.out.println("Enter T");
	T=sc.nextInt();
	System.out.println("Enter R");
	R=sc.nextInt();
	
	//SI=P*T*R;
	
	int nt = 1;
	A=P*(1+R/100)^nt;
    CI=A-P;
    System.out.println("Compound intresrt is:"+CI);
	}

}
