package com.innerClass;
class Bank{
	private static String bname="SBI Bank";
	String bankloc;
	String ifsccode;
	String aName;
	int accNo;
	{
		bankloc="Delhi";
		ifsccode="SBINDE1234";
	}
	Bank(){
		
	}
	Bank(int accNo,String aName){
		this.accNo=accNo;
		this.aName=aName;
	}
	void displayBankDetails() {
		System.out.println(bname+ " "+bankloc);
         System.out.println(ifsccode);
	}
	class Locker{
		int lockerid;
		String pass;
		static float lockerRent=2000;
		Locker(){
			
		}
		public Locker (int lockerid,String pass) {
			super();
			this.lockerid=lockerid;
			this.pass=pass;
		}
		void displayBankDetails() {
			
		System.out.println("This locker belongs to :"+aName+" with accno:"+accNo);
			System.out.println(lockerid+ " "+pass);
	         System.out.println("Rent to be paid:"+lockerRent);
	}
}
public class BankLockerDemo {

	public static void main(String[] args) {
		Bank cust1=new Bank(1011,"Onkar");
		//Bank.Locker loc1

	}
}
}

