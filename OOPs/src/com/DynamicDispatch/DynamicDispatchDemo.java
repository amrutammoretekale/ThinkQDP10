package com.DynamicDispatch;
class Bank{
	protected double rate;
	
	public void getRateOfInterest() {
		rate=5;
		System.out.println("Rate of interast is"+rate+"%");
	}
}
class SBIBank extends Bank{
	public void getRateOfInterest() {
		rate=5.6;
		System.out.println("Rate of interast is"+rate+"%");
		
	}
	void showBankDetails() {
		
	}
}
class HDFCBank extends Bank{
	public void getRateOfInterest() {
		rate=5.8;
		System.out.println("Rate of interast is"+rate+"%");
	}
}
public class DynamicDispatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBIBank();
		b.getRateOfInterest();
		//b.showBankDetails();
		
		b=new HDFCBank();
		b.getRateOfInterest();
		
		System.out.println("----------");
		SBIBank s1=new SBIBank();
		s1.getRateOfInterest();
		s1.showBankDetails();
	}

}
