package com.methodOverride;
//A bank has a principal amount and a rate of interest which is 2%. 
//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether 
//the account is default/ savings/ current.
class Bank{
	private double pAmount;
	private double rate;
	
	public Bank() {
		
	}
	public Bank(double pAmount,double rate) {
		this.pAmount=pAmount;
		this.rate=rate;
	}
	public void display() {
		
		System.out.println("Default rate of intreast is 2%");
	}
	public void setPAount(double pAmount) {
		this.pAmount=pAmount;
	}
	public double getpAmount() {
		return pAmount;
	}
	public void setRate(double rate) {
		this.rate=rate;
		}
	public double getpRate() {
		return rate;
	}
	
}
class SavingAccount extends Bank{
	private int  Sid;
	private String Sname;
	
	SavingAccount(){
		
	}
	SavingAccount(double pAmount,double rate,int Sid,String Sname){
		super(pAmount,rate);
		this.Sid=Sid;
		this.Sname=Sname;
	}
	public void display() {
		super.display();
		System.out.println("SavingAccount: rate of interest 3% ");
	}
	public void setSid(int Sid) {
		this.Sid=Sid;
	}
	public double getSid() {
		return Sid;
	}
	public void setSname(String Sname) {
		this.Sname=Sname;
	}
	public String getSname() {
		return Sname;
	}
}
class  CurrentAccount extends Bank{
	private int Cid;
	private String Cname;
	
	 CurrentAccount() {
		
	}
	CurrentAccount(double pAmount,double rate,int Sid,String Sname,int Cid,String Cname) {
		super(pAmount,rate);
		this.Cid=Cid;
		this.Cname=Cname;
	}
	public void display() {
		System.out.println("CurrentAccount: rate of interest 5% ");
	}
	public void setCid(int Cid) {
		this.Cid=Cid;
	}
	public double getCid() {
		return Cid;
	}
	public void setCname(String Cname) {
		this.Cname=Cname;
	}
	public String getCname() {
		return Cname;
	}

}


public class BankTest {

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.display();
		
		SavingAccount s1=new SavingAccount();
		s1.display();
		
		CurrentAccount c1=new CurrentAccount();
		c1.display();

	}

}
