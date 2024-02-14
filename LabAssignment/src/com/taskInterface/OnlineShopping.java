package com.taskInterface;
//Create an online shopping which has various modes to paythe Bill
//If paid through cash.. no discount
//Paytm ... above 1000,, cashback 500
//Credit card .. any amount : 20% discount
//Debit card.... above 5000 : 20% discount
//Try to the pay bill using different modes



interface Shoping{
	void payprocess(double amount);
	
}
class Cash implements Shoping{
	int amount;
	
  Cash(){
	  
  }
	@Override
	public void payprocess(double amount) {
		System.out.println("no Discount"+amount);
		
	}
	
}
class Paytm implements Shoping{
	double amount;
  Paytm(){
	  
  }
	@Override
	public void payprocess(double amount) {
	
	if(amount>1000) {
		 
		 System.out.println(amount);
		 System.out.println("Cashback 500");
	}
		 else
			 System.out.println("no cashback"+amount);
	 }
	
}
class CreditCard implements Shoping{
	double amount;
CreditCard(){
	
}
	@Override
	public void payprocess(double amount) {
		if(amount>2000) {
		
			System.out.println("cashback 20%"+amount);
		}
		
	}
	
} 
class DebitCard implements Shoping{
   double amount;
    DebitCard(){
    	
    }
	@Override
	public void payprocess(double amount) {
		if(amount>5000)
			System.out.println("cashback 20%"+amount);
		
	}
	
}
public class OnlineShopping {
	double amount;
	public void paybill(Shoping c,double amount) {
		this.amount=amount;
		c.payprocess(amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShopping obj=new OnlineShopping();
		CreditCard c1=new CreditCard();
		obj.paybill(c1, 2000);


	}
	
		
	}


