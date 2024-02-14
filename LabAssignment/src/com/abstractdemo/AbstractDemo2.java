package com.abstractdemo;

import com.abstractdemo.Book.NoteBook;

abstract class Book{
	private int id;
	private String name;
	private double cost;
	public Book() {
		
	}
	
	Book(int id,String name,double cost){
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCost(double cost ) {
		this.cost=cost;
	}
	public double getCost() {
		return cost;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("cost:"+cost);
	}
	class NoteBook extends Book{
		private int Nid;
		private String Nname;
		
		NoteBook(){
			
		}
		NoteBook(int id,String name,double cost,int Nid,String Nname){
			super(id,name,cost);
			this.Nname=Nname;
			this.Nid=Nid;
			}
		public int getNid() {
			return Nid;
		}
		public void setNid(int nid) {
			Nid = nid;
		}
		public String getNname() {
			return Nname;
		}
		public void setNname(String nname) {
			Nname = nname;
		}
		void display() {
			System.out.println("Nname:"+Nname);
			System.out.println("Nid:"+Nid);
			
		}
	}
	class TextBook extends Book{
		private int Tid;
		private String Tname;
		
		public TextBook(){
		super();
	}
	TextBook(int Tid,String Tname,int id,String name,double cost,int Nid,String Nname){
		super(id,name,cost);
		this.Tid=Tid;
		this.Tname=Tname;
	}
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	void display() {
		System.out.println("Nname:"+Tname);
		System.out.println("Nid:"+Tid);
		
	}
}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		Book b;
	//	b=new TextBook(101,"English",100);
		//b.display();
		
	//	b=new NoteBook(102,"calssment",150);
		//b.display();

	}

}
