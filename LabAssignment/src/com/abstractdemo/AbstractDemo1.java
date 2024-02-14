package com.abstractdemo;

//Write a Java program to create an abstract class BankAccount with abstract methods 
//deposit() 
//and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//and implement the respective methods to handle deposits and withdrawals for each 
//account type.
abstract class BankAccount {
	private int accno;
	private String name;
	protected String ifsc;
	protected double balance;

	BankAccount() {

	}

	BankAccount(int accno, String name, String ifsc, double balance) {
		this.accno = accno;
		this.name = name;
		this.ifsc = ifsc;
		this.balance = balance;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getAccno() {
		return accno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	abstract void deposite(double amount);

	abstract void withdrow(double amount);
}
	class SavingAccount extends BankAccount {
		
		private int saccno;
		private String sname;

		SavingAccount() {

		}

		SavingAccount(int accno, String name, String ifsc, double balance,int saccno,String sname){
		super(accno,name,ifsc,balance);
		   this.saccno=saccno;
			this.sname=sname;
		}
	
		@Override
		void deposite(double amount) {
			if (balance < amount) {
				balance = balance + amount;
				System.out.println("deposite:" + balance);
				
			}
		}

		@Override
		void withdrow(double amount) {
			if (balance > amount) {
				balance = balance - amount;
				System.out.println("withdrow:" + balance);
			}
		}
	}

	class CurrentAccount extends BankAccount {
		private int cacno;
		private String cname;

		CurrentAccount() {

		}

		CurrentAccount(int accno, String name, String ifsc, double balance,int saccno,String sname,int cacno,String cname) {
			this.cacno=cacno;
			this.cname=cname;
			
		}

		@Override
		void deposite(double amount) {
			if (balance < amount) {
				balance = balance + amount;
				System.out.println("deposite:" + balance);
			}

		}

		@Override
		void withdrow(double amount) {
			if (balance > amount) {
				balance = balance - amount;
				System.out.println("withdrow:" + balance);

			}

		}

	}

	public class AbstractDemo1 {

		public static void main(String[] args) {
			BankAccount bank;
			bank = new SavingAccount();
			bank.deposite(1000);
			bank.withdrow(500);

			bank = new CurrentAccount();
			bank.deposite(1000);
			bank.withdrow(500);

		}

	}

