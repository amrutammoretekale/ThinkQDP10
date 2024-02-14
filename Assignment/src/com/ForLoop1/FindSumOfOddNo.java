package com.ForLoop1;

public class FindSumOfOddNo {
	public static int oddno(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			if(i%2!=0){
			sum=sum+i;
			System.out.println("sum:"+sum);
			}
		}return sum;
	}

	public static void main(String[] args) {
		 int n = 5;
		oddno(n);

	}

}
