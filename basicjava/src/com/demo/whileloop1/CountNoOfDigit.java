package com.demo.whileloop1;

public class CountNoOfDigit {
	public static void sepratedigit(int num) {
		int rem;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem);
			System.out.println(num);
		}System.out.println("orignal number:"+num);
	}
	public static void countdigit(int num) {
		int i,rem;
		int count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}System.out.println("count:"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sepratedigit(456);
		countdigit(78654);

	}

}
