package com.ForLoop1;



//.WAP to print squares from 1 to20
public class PrintSqr {
	public static int printsqr(int num) {
		int i,sqr = 1;
		for(i=0;i<=20;i++) {
			System.out.println("Square of:"+""+i+"-"+" "+i*i);
			
		}return sqr;
	}

	public static void main(String[] args) {
		 int num = 1;
		printsqr(num);
		

	}

}
