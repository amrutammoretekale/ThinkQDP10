package com.conditional;

import java.util.Scanner;

public class CheckNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		amount=sc.nextInt();//800
		if(amount>=500) {
			n500=amount/500;//1 quationt
			amount=amount%500;//300 rem
		}
		if(amount>=200) {
			n200=amount/200;//1 
			amount=amount%200;//100
		}
		if(amount>=100) {
			n100=amount/100;//1
			amount=amount%100;//0
		}
		if(amount>=50) {
			n50=amount/50;
			amount=amount%50;
		}
		if(amount>=20) {
			n20=amount/20;
			amount=amount%20;
		}
		if(amount>=10) {
			n10=amount/10;
			amount=amount%10;
		}
		System.out.println("notes of 500 is"+n500);
		System.out.println("notes of 200 is"+n200);
		System.out.println("notes of 100 is"+n100);
		System.out.println("notes of 50 is"+n50);
		System.out.println("notes of 20 is"+n20);
		System.out.println("notes of 10 is"+n10);
	}

}
