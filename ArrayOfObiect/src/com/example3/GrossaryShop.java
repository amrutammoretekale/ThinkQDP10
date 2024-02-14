package com.example3;



public class GrossaryShop {
  static void itemSupplier(Suplier st[],String itemname) {
	  System.out.println(itemname);
	  for(Suplier s:st) {
		  for(Item i:s.getItem()) {
			  if(i.getName().equals(itemname)) {
				  System.out.println(s.getSid()+" "+s.getname+" "+s.getMobileno());
			  }
		  }
	  }
  }
	public static void main(String[] args) {
		Suplier sup=new Suplier[2];
	    Item i1=new Item[3];
		

	}

}
