package com.demo.switchcase;

import java.util.Scanner;

public class Test_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int choice;
    System.out.println("----Welcome CCd---");
    System.out.println("1.Tea/n.2.cofee/n3.cold drink");
    
    System.out.println("Enter your choice:");
    choice=sc.nextInt();
    switch(choice) {
    case 1:{
    	System.out.println("Tea for Rs 20");
    	break;
    }
	case 2:{
    	System.out.println("coffee for Rs 100");
    	break;
	}
	case 3:{
    	System.out.println("coid drink for Rs 200");
    	break;}
	default:
		System.out.println("his option is not available");
	}

}
}