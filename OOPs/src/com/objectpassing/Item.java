package com.objectpassing;

public class Item {
	private int itemid;
	private String iname;
	private double icost,price;
	private int qty;
	double discprice;
	
	Item(){
		
	}
	Item(int itemid,String iname,double icost,int qty){
		this.itemid=itemid;
		this.iname=iname;
		this.icost=icost;
		this.qty=qty;
	}
	// mutators and accessors
	public void setItemid(int itemid) {
		this.itemid=itemid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setIname(String iname) {
		this.iname=iname;
	}
	public String getIname() {
		return iname;
	}
	public void setIcost(double icost) {
		this.icost=icost;
	}
	public double getIcost() {
		return icost;
	}
	public void setQty(int qty) {
		this.qty=qty;
		
	}
	public int getQty() {
		return qty;
	}
	public double calTotalPrice() {
		
		double totalprice = qty*icost;
		return totalprice;
	}
	public double calDisscountprice(double discount) {
		double total=calTotalPrice();
		discprice=total-((discount/100)*total);
		return discprice;
	}
	public void compareCost(Item i2) {
		
	          if(this.discprice==i2.discprice)
				System.out.println("Both have same cost..");
			  else if(this.discprice>i2.discprice)
				System.out.println(this.getIname()+" has higher cost");
				else 
					System.out.println(i2.getIname()+" has higher cost");
	}
	
	
	
	public String toString() {

	return "itemid:"+itemid+" "+"iname:"+iname+" "+"icost"+icost+"Total:"+ calTotalPrice();
		
	}
	
	
       
}
