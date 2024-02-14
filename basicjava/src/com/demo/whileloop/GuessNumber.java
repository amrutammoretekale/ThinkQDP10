package com.demo.whileloop;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 15, guess ;
	
		while(true){
			System.out.println("Enter any Number");
			guess = sc.nextInt();
			if(guess>num)
				System.out.println("Too High");
			else if(guess<num)
				System.out.println("Too Low");
			else if(guess==num)
				System.out.println("congo!! you guessed correct number");
			
			}
			
		}


	}


