package com.demo.switchcase;


import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  double balance=10000,amount;
  int choice;
  System.out.println("1.Deposite\n2.Withdrow\n3.View balance");
  System.out.println("Enter your choice");
  choice=sc.nextInt();
  switch(choice) {
  case 1:
   System.out.println("Enter amount you want to deposit");
   amount=sc.nextDouble();
   balance=balance+amount;
   System.out.println("Total balance:"+balance);
   break;
  case 2:
	   System.out.println("Enter amount you want to Withdrow");
	   amount=sc.nextDouble();
	   balance=balance-amount;
	   System.out.println("Total balance:"+balance);
	   break;
  case 3:
	  System.out.println("Total balance"+balance);
	  break;
  }
	}

}
