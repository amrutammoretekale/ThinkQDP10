package com.method;

public class Reverse_Test {
	public static int findreverse(int num) {
	  int rev=0,rem;//123
	     while(num!=0) {
	    	 rem=num%10;// 3 2 1
	    	 rev=rev*10+rem;//3 32 321
	    	 num=num/10;//123 12
	     }return rev;
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     findreverse(123);
	}

}
