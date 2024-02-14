package com.If_Else;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int month;
        System.out.println("Enter month");
        month=sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        System.out.println(" 31 days in month");
        else if(month==4||month==9||month==11)
        System.out.println("30 days in month");
        else if(month==2)
        System.out.println("28 or 29 days in month");
        else
        	System.out.println("month should be in between 1 to 12");
	}

}
