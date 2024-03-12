package com.task2;

public class SumOfDigit {
	static void findsum(String s) {
		int sum=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(arr[i])) {
				int x=Character.getNumericValue(arr[i]);
				sum=sum+x;
			}
		}
		System.out.println("sum is..."+sum);
		
	}
	static void findsum2(String s) {
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int x=ch[i]-48;
				sum=sum+x;
			}
		}
		System.out.println("sum is..."+sum);
	}
	public static void main(String[] args) {
		String s="Sachin  scores 567 rns in test match";
		findsum2(s);
		findsum(s);

	}

}
