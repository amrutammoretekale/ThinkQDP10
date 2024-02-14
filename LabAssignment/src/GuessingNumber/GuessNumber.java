package GuessingNumber;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 15, guess ;
		System.out.println("Enter any Number");
		guess = sc.nextInt();
		for (;;) {
			if (num == guess) {
				
				break;
			} else if (guess < num) {
				System.out.println("guess is less! Enter higher number");
			} else if (guess > num) {
				System.out.println("guess is high! Enter Lower number");
				break;
			}
			
		}System.out.println("Congratulations you Guessed Correct Number");


	}

}
