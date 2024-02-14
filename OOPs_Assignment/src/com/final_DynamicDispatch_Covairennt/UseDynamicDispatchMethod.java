package com.final_DynamicDispatch_Covairennt;
//Create a class Game having the method rules() and noOfPlayers(). 
//Create a class BasketBall, Soccer, Cricket
//which are child class of Game. Override the above methods and use dynamic method dispatch
//to show thw rules and noofPlayers according to the object passed
class Game{
	protected int id;
	protected String name;
	
	Game(){
		
	}
	Game(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void rules() {
		System.out.println("play in a group ");
	}
	public void noofplayers() {
		System.out.println("no of player shoud be 8");
	}
}
class BasketBoll extends Game{
	protected int Bid;
	protected String Bname;
	
	BasketBoll(){
		
	}
	BasketBoll(int id,String name,int Bid,String Bname){
		super(id,name);
		this.Bid=Bid;
		this.Bname=Bname;
	}
	public void rules() {
		System.out.println("play in a group ");
	}
	public void noofplayers() {
		System.out.println("no of player shoud be 10");
	}
}
class Soccer extends Game{
	protected int Sid;
	protected String Sname;
	Soccer(){
		
	}
	Soccer(int id,String name,int Bid,String Bname,int Sid,String Sname){
		super();
		this.Sid=Sid;
		this.Sname=Sname;
	}
	public void rules() {
		System.out.println("play in a group ");
	}
	public void noofplayers() {
		System.out.println("no of player shoud be 5");
	}
}
class Cricket extends Game{
	protected int Cid;
	protected String Cname;
	
	Cricket(){
		
	}
	Cricket(int id,String name,int Bid,String Bname,int Sid,String Sname,int Cid,String Cname){
		super();
		this.Cid=Cid;
		this.Cname=Cname;
	}
	public void rules() {
		System.out.println("play in a group ");
	}
	public void noofplayers() {
		System.out.println("no of player shoud be 12");
	}
}
public class UseDynamicDispatchMethod {

	public static void main(String[] args) {
		Game g1;
		g1=new BasketBoll();
		g1.rules();
		g1.noofplayers();
		
		g1=new Soccer();
		g1.rules();
		g1.noofplayers();
		
		g1=new Cricket();
		g1.rules();
		g1.noofplayers();

	}

}
