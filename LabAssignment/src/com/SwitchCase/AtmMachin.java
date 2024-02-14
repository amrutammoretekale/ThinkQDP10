package com.SwitchCase;

import java.util.Scanner;

public class AtmMachin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
    double balance=10000,amount;
    int choice;
    System.out.println("1.Deposite/n2.Withdrow/n3.Balance");
    System.out.println("Enter your choice");
    choice=sc.nextInt();
    switch(choice){
    	case 1:
    		System.out.println("Enter your deposite amount");
    		amount=sc.nextInt();
    		balance=balance+amount;
    		break;
    	case 2:
    		System.out.println("Enter your withdrow amount");
    		amount=sc.nextInt();
    		balance=balance-amount;
    		break;
    	case 3:
    		System.out.println("balance:" +balance);
    			
    }
	}

}
