package com.enumDemo;

import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter type of ticket");
		System.out.println("1. Standard:"+MovieSeat.STANDARD.price);
		System.out.println("2. premium:"+MovieSeat.PREMIUM.price);
		System.out.println("3. Recliner:"+MovieSeat.RECLINER.price);

		int seatType=sc.nextInt();
		System.out.println("Enter number of seat:");
		int no=sc.nextInt();
		MovieSeat ms=null;
		switch(seatType) {
		case 1:ms=MovieSeat.STANDARD;
		      break;
		case 2:ms=MovieSeat.PREMIUM;
	           break;
		case 3:ms=MovieSeat.RECLINER;
             break;
             default:System.out.println("No sucj type of seat available");
             
		}
		System.out.println("Ticket Type:"+ms);
		System.out.println("number of tickets:"+no);
		System.out.println("total amount:"+(no*(ms.price)));
	
	}

}
