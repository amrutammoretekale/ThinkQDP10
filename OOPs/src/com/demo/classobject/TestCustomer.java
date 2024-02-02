package com.demo.classobject;

     class Customer{
	     int cusid;
	     String custname;
     
     public void setData(int cid ,String cname) {
	    cusid=cid;
	    custname=cname;
   }
	
         public void showData() {
	      System.out.println("Customer id:"+cusid);
	      System.out.println("Customer name:"+custname);
	}
}


        public class TestCustomer {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	Customer c1=new Customer();
	    	Customer c2=new Customer();
	    	Customer c3=new Customer();
	    	
	    	c1.setData(1,"rohan");
	    	c2.setData(2, "riya");
	    	c3.setData(3, "radha");
	    	
	    	c1.showData();
	    	c2.showData();
	    	c3.showData();

	}

}
