package com.forloop1;

import java.util.Scanner;

public class Test_Loop2 {
     public static void printNo(int range) {
    	 int i;
    	 for(i=1;i<=range;i++) {
    		 System.out.println(i);
    	 }
     }
     
     public static void printNumber(int start,int end) {
    	 int i;
    	 for(i=start;i<=end;i++) {
    		 System.out.println(i);
    	 }
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		printNo(num);
		System.out.println("Enter start");
		int start = sc.nextInt();
		System.out.println("Enter end");
		int end = sc.nextInt();
		printNumber(start,end);

	}

}
