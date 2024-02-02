package com.demo.classobject;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
	//	System.out.println(b1.accno);
	//	System.out.println(b1.name);
	//	System.out.println(b1.balance);
		b1.setData(101010, "Arnav", 1000);
		b1.display();
	
		b1.setbalance(5000);
		b1.display();
		
		System.out.println(b1.getbalance());

	}

}
