package com.datatype;
// Write a Java program to enter marks of five subjects and calculate
//total, average and percentage.

import java.util.Scanner;

public class FindAvgOf5Sub {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int s1,s2,s3,s4,s5;
	    int total,avg;
	    float per;
		System.out.println("enter marks of subject1 ");
		s1=sc.nextInt();
		System.out.println("enter marks of subject2 ");
		s2=sc.nextInt();
		System.out.println("enter marks of subject3 ");
		s3=sc.nextInt();
		System.out.println("enter marks of subject4 ");
		s4=sc.nextInt();
		System.out.println("enter marks of subject5 ");
		s5=sc.nextInt();
		total=s1+s2+s3+s4+s5;
		avg=total/5;
		per=(total/5)*100;
		System.out.println("Total:"+total);
		System.out.println("average:"+avg);
		System.out.println("percentage:"+per);

	}

}
