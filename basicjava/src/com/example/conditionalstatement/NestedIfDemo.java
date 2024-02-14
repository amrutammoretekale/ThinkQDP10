package com.example.conditionalstatement;
import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		num= sc.nextInt();
		System.out.println("Enter Number");
		 if(num%4==0) {
			 if(num%6==0) {
				 System.out.println("Number is divisible by 4 & 6");
			 }
			 else {
				 System.out.println("Number is only divisible by 4&6");
			 }
		 }else
		 {
				System.out.println("Number is not divisible by 4&6");
			}
	}
	

}
