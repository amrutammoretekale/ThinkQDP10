package com.do_while;

import java.util.Scanner;

//Write Java Program to Display the ATM Transaction.
//The user will choose from any one of the available options as input. 
//Different cases using switch case have been provided for different
//operations like withdraw, deposit and check balance.
//Use do while loop for multiple transaction

//Hint: you can set initial pin and balance in ur code
//After entering correct pin user should able to do transaction
//Options

//1.Withdraw
//2.Deposit
//3.check balance
//4.Currency Nomination
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		String username;
		int pin=8722;
		int choice;
		int balance=1000;
		int amount=0;
		int deposite=0;
		int withdrow = 0;
		System.out.println("---welcome to SBI bank-----");
		System.out.println("Enter usename");
		username=sc.next();
		System.out.println("Enter pin");
		pin=sc.nextInt();
		if(pin==8722) {
		char ch;
		do{System.out.println("1.Deposite\n2.Withdrow\n3.Check balance\n4.currancy nomination");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			  System.out.println("Enter your deposite amount ");
			  deposite=sc.nextInt();
			  balance=balance+deposite;
			  System.out.println("deposite amount:"+deposite);
			  System.out.println("balance:"+balance); 
			 break;
		case 2:
			  System.out.println("Enter your withdrow amount");
			  withdrow=sc.nextInt();
			  balance=balance-withdrow;
			  System.out.println("withdrow amount:"+withdrow);
			  System.out.println("balance:"+balance);
			break;
		case 3:
		  
		     if(deposite>=balance) 
		     balance=balance+deposite;
			 else if (withdrow<=balance) 
			 balance=balance-amount;
		     System.out.println("balance:"+balance);
		     break;
			
		case 4:
			 System.out.println("currancy nomination");
			 int currrancy=sc.nextInt();
			 break;
	    default:
			 System.out.println("invalid input");
			 break;
		
		}
		
		 System.out.println("Do you want to continue if yes Enter Y:");
	     ch=sc.next().charAt(0);
		 }while(ch=='Y'||ch=='y');
		 System.out.println("Thankyou Amruta");
	
		
		}	else
			System.out.println("invalid pin");
		   
	}
			
	}


