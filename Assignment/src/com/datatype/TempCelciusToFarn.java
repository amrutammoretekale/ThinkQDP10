package com.datatype;

import java.util.Scanner;

public class TempCelciusToFarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    float celcius,fahrenheit;
    System.out.println("Enter Temp in celcius");
    celcius=sc.nextFloat();
    fahrenheit=(float)1.8*celcius+32;
    System.out.println("temp in fahrenheit:"+fahrenheit);
	}

}
