package com.method;
//WAP  to print sum of l natural numbers
public class Method_loop_demo1 {
	static int i;
	static int sum = 0;

	public static void calsum(int n) {
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum:" + sum);
	}

	public static int calsum1(int n) {
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		//calSum(num);
		//or
		int sum = calsum1(num);
		System.out.println(sum);
	}

}
