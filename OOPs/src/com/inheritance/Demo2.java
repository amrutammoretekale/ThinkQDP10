package com.inheritance;
//reate class Fish { String name , int gills  } . Class Fish has
//method void swim() which has some default implementation. 
//Create two subclasses of Fish , GoldFish and Whale. Override swim method in 
//GoldFish by changing access modifier and Override 
//in Whale class by changing its return type
class Fish{
	private int gills; 
	private String name;
	
	Fish(){
		
	}
	Fish(int gills,String name){
	  this.gills=gills;
	  this.name=name;
	}
	
	public int getGills() {
		return gills;
	}
	public void setGills(int gills) {
		this.gills = gills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void swim() {
		System.out.println("Swimming.....");
	}
	
}
class GoldFish extends Fish{
	 private String Gname;
	 GoldFish(){
		 
	 }
	 GoldFish(int gills,String name,String Gname){
		 super(gills,name);
		 this.Gname=Gname;
	 }
	public String getGname() {
		return Gname;
	}
	public void setGname(String gname) {
		Gname = gname;
	}
	 public void swim() {
		 System.out.println(" GoldFish Swiming......");
	 }
}
class Whale extends Fish{
	private String Wname;
	
	Whale(){
		
	}
	Whale(String Wname,String Gname ){
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
