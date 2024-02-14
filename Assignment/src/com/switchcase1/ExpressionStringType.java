package com.switchcase1;

import java.util.Scanner;

public class ExpressionStringType {
    public static void month1(int month) {
    	String monthString=""; 
		switch(month) {
		case 1:monthString= "1-janevary";
		case 2:monthString= "2-febvary";
		case 3:monthString= "3-march";
		case 4:monthString= "4-april";
		case 5:monthString= "5-may";
		case 6:monthString= "6-june";
		case 7:monthString= "7-july";
		case 8:monthString= "8-August";
		case 9:monthString= "9-Suptember";
		case 10:monthString ="10-Octomber";
		case 11:monthString= "11-November";
		case 12:monthString= "12-December";
		
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month");
		 int month = sc.nextInt();
		month1(month);

	}

}
