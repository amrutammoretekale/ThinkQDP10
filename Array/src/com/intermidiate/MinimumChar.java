package com.intermidiate;

public class MinimumChar {
	public static void minchar(char arr[]) {
		   char i = 0;
			char min=arr[i];
			for(i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
	}System.out.println(min);
	}
	public static void main(String[] args) {
	  char arr[]=new char[] {'a','m','r','u','t','a'};
	  minchar(arr);
	}

}
