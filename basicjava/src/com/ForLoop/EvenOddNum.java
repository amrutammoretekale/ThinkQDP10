package com.ForLoop;

//WAP to print even number from 1 to 50
//WAP to print which number is even or odd from 1 to 50 
public class EvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "is even ");
			} else {
				System.out.println(i + "Odd Number");

			}
		}
	}

}
