package com.ForLoop1;
//1.	 WAP to print even numbers from 121 to 229 using for loop. 
import java.util.Scanner;

public class PrintEvenNumber {
	public static void PrintEvn(int num) {
      int i;
		
		for(i=121;i<=229;i++) {
			if(i%2==0)
				System.out.println(i);}
	}

	public static void main(String[] args) {
		int i = 121;
		PrintEvn(i);

	}

}
