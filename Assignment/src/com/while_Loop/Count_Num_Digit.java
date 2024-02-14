package com.while_Loop;

//WAP to count digit in any number
import java.util.Scanner;

public class Count_Num_Digit {
	public static void printno(int num) {
		Scanner sc = new Scanner(System.in);
		int  i, count = 0;
		System.out.println("Enter the number");
		num = sc.nextInt();// 456
		while (num != 0) {

			num /= 10;// 45
			count++;
		}
		System.out.println("count:" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		printno(num);
	}

}
