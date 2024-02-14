package com.For_Loop;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int day,month,i,n=1;
System.out.println("Enter the month");
month=sc.nextInt();
for(i=1;i<=n;i++){
	if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
  System.out.println("30 Day in month");
else if (month==4||month==6||month==11) 
	System.out.println("31 Dys in month");
	else if(month==2)
	System.out.println("28 days in month");
	else {
		System.out.println("Enter valid number between 1to12");
	}
		
	}
	}
}
