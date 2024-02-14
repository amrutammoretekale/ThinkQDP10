package com.demo.whileloop1;

import java.util.Scanner;

public class GuessNumber {
	public static void guessno(int num) {
		Scanner sc=new Scanner(System.in);
		int gnum = 55;
		int count=0;
		while(num!=0) {
			if(num>gnum) {
				System.out.println(num+" is too high!! Entter lower number");
			    System.out.println("Enter number");
			    num=sc.nextInt();}
			else if(num<gnum) {
				System.out.println(num+" is too low!! Enter higher number");
			    System.out.println("Enter number");
			    num=sc.nextInt();}
			else if(num==gnum) {
				System.out.println(num+" congo!! you guess correct number");
			   break;
			    }
			 count++;
			}
		System.out.println("count:"+count);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		guessno(num);
		

	}

}
