package com.demo.classobject;

public class Bank {
	   //private long accno=101;
	   //private String name="heena";
	   //private double balance=10000;
	
	     long accno=101;
	     String name="heena";
	     double balance=10000;
	
     public void setData(long accno,String name,double balance) {
	      this.accno=accno;
	      this.name=name;
	      this.balance=balance;
}	
     public void display() {
    	 System.out.println("accno:"+accno);
    	 System.out.println("name:"+name);
    	 System.out.println("balance:"+balance);
     }

       //setters or getters
       //setters-void with parameter
       //getter - return type (data type) without parameter no void

     public void setaccno(long accno) {
	     this.accno=accno;
          }
     public long getAccno() {
	      return accno;
          }
     public void setname(String accno) {
	      this.name=name;
          }
     public String getname() {
	     return name;
          }
      public void setbalance(double balance) {
	     this.balance=balance;
          }
     public double getbalance() {
	      return balance;
          }

}
