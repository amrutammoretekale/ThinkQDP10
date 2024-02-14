package com.method;

import java.util.Scanner;

public class ClalGrade {
  public static char cal(int s1,int s2) {
	  int per = 0,grade;
	  if(per>=90) 
		  grade='A';
		  else if (per>=75) 
			  grade='B';
		  else if(per>=50) 
			  grade='D';
		  else if(per>=40)
		   grade='E';
	  else 
		 return 0;
	return 0;
	 }
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks = 1,s1,s2,s3;
		int s4,gread = 1;
		
		System.out.println("Enter the marks of s1");
		s1=sc.nextInt();
		System.out.println("Enter the marks of s2");
		s2=sc.nextInt();
		System.out.println("Enter the marks of s3");
		s3=sc.nextInt();
		System.out.println("Enter the marks of s4");
		s4=sc.nextInt();
		char grade=cal(s1,s2);
		System.out.println("marks"+marks+"get gread:"+gread);
		
	}

}
