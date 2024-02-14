package com.while_loop;

public class Palidrome {
	public static int findrev(int num) {
		int rem,rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}return rev;
	}
	public static boolean findpalindrome(int num) {
		int rev=findrev(num);
		if(rev==num) 
			return true;
			else
			return false;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		boolean status=findpalindrome(num);
		if (status)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
		

	}

}
