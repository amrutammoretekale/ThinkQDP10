package com.forloop1;

import java.util.Scanner;

public class EvenNum {
 public static void printnum(int num) {
	 int i;
	 for(i=1;i<=10;i++) {
		 if(i%2==0)
		System.out.println(i);
		
	 }

 }
 public static void printnum1(int num) {
	 int i;
	 for(i=0;i<=10;i++) {
		 if(i%2!=0) {
			 System.out.println(i);
		 }
	 }
		 
	 }
 
	public static void main(String[] args) {
		
		int num = 0;
		printnum( num);
		
		printnum1( num);
		
		

	}

}
