package com.IfElse;

import java.util.Scanner;

public class DayInMonth1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("Enter the month");
		month = sc.nextInt();

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("30 Days in a month");
		}

		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("31 Days in a month");
		}

		else if (month == 2) {
			System.out.println("28 Dys in a month");
		} else {
			System.out.println("please Enter valid number between 1to10");
		}
	}

}
