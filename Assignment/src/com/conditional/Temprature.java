package com.conditional;

import java.util.Scanner;

//Write a C program to read temperature in centigrade and display a suitable message according to the temperature state below:
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot

public class Temprature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("Enter temprature");
	
		temp=sc.nextInt();
		if(temp<0)
			System.out.println("Freezing weather");
		else if (temp>0 && temp<10)
			System.out.println(" very cold weather");
		else if (temp>10 && temp<20)
			System.out.println("  cold weather");
		else if (temp>20 && temp<30)
			System.out.println(" norml in temp");
		else if (temp>30 && temp<40)
			System.out.println(" its hot");
		else if (temp>40)
			System.out.println(" its very hot");

	}

}
