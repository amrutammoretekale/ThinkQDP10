package com.final_DynamicDispatch_Covairennt;
//Create a class Showroom having showroomid, showroomName
//Create the showroom name as static and final and create a variable space as final
//Initialize the final variable
//Create a final method empRules() and create a class BikeShowRoom which inherits 
//Showroom and try
//to override empRules
class Showroom{
	protected int showroomid=10;
	final static String showroomname="Bajaj";
	
	Showroom(){
		
	}
	Showroom(int showroomid,String  showroomname ){
	    this.showroomid=showroomid;
	 }
	void display() {
		System.out.println(showroomid+" "+showroomname);
	}
	final void empRules() {
		System.out.println("important rules are :");
	}
}
class Bikeshowroom extends Showroom{
	    protected int Bid;
	    
	    Bikeshowroom(){
	    	
	    }
	    Bikeshowroom(int showroomid,String  showroomname,int Bid ){
	    	this.Bid=Bid;
	    }
	    void display() {
			System.out.println(showroomid+" "+showroomname+" "+Bid);
		}
//		final void empRules() {
//			System.out.println("important rules are :");
//		}
}
public class InheritDemo {

	public static void main(String[] args) {
		Showroom s1=new Showroom();
		s1.display();
		s1.empRules(); 
		
		Bikeshowroom b1=new Bikeshowroom();
		s1.display();
		s1.empRules(); 

	}

}
