package com.innerClass;
class Bank {
	private static String bname = "SBI Bank";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;

	{
		bankloc = "Delhi";
		ifscCode = "SBINDE1234";
	}

	Bank() {

	}

	Bank(int accNo, String aName) {
		this.accNo = accNo;
		this.aName = aName;
	}

	void displayBankDetails() {
		System.out.println(bname + " " + bankloc);
		System.out.println(ifscCode);
	}

	 // Before Jdk 1.8 we cannot have static variables and method in member inner class
	class Locker {
		int lockerId;
		String pass;
		static float lockerRent = 2000;

		Locker() {

		}

		public Locker(int lockerId, String pass) {
			super();
			this.lockerId = lockerId;
			this.pass = pass;
		}
		
//		static void show()
//		{
//			Bank b1= new Bank();
//			System.out.println("This locker belongs to :" + b1.aName + " with accNo:" + b1.accNo);
//		}

		void displayLockerDetails() {
			displayBankDetails();
			System.out.println("This locker belongs to :" + aName + " with accNo:" + accNo);
			System.out.println("Locker Id:" + lockerId);
			System.out.println("Rent to be paid:" + lockerRent);
		}
	}

}

public class BankLockerDemo {

	public static void main(String[] args) {
		Bank cust1= new Bank(1011, "Onkar");
		Bank.Locker lock1= cust1.new Locker(10, "On123");
		
		cust1.displayBankDetails();
		System.out.println("--------------------------------");
		lock1.displayLockerDetails();
		
		System.out.println("---------------------------------------------");
		Bank.Locker lock2= new Bank(201, "Rahul").new Locker(12, "R123");
		lock2.displayLockerDetails();

	}
}


