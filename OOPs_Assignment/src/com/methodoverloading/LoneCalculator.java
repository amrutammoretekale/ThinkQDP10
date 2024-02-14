package com.methodoverloading;

import java.util.Scanner;

//You have to build a loan calculator.
//If a single rate of interest is provided then it is a housing loan 
//and loan is principal amount * (100 + rate) 
//If two values are provided then it is a commercial loan 
//and loan is principal amount * (value 1 + value 2 +100)
class Calculator {
	private double pAmount;
	private double loneAmount;

	public Calculator() {

	}

	public Calculator(double pAmount) {
		this.pAmount = pAmount;
	}

	public void setPAmount(double pAmount) {
		this.pAmount = pAmount;
	}

	public double getPAmount() {
		return pAmount;
	}

	public Double loneAmount(double rate) {
		loneAmount = pAmount * (100 + rate);
		return loneAmount;
	}

	public double loneAmount(double value1, double value2) {
		loneAmount = pAmount * (value1 + value2 + 100);
		return loneAmount;
	}
	

}

public class LoneCalculator {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Enter Principal amount:");
		c1.setPAmount(sc.nextDouble());
		System.out.println("Housing lone:");
		System.out.println(c1.loneAmount(10));
		System.out.println("Housing lone:");
		System.out.println(c1.loneAmount(4, 5));

	}
}
