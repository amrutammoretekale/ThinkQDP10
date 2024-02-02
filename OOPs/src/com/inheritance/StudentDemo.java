package com.inheritance;

class Student{
	private int id;
	private String name;
	
	Student(){
		
	}
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
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
	public String toString() {
		return "name"+name+"id"+id;
	}
}

class School extends Student{
	private int std;
	private String Sname;
	
   public School(){
		
	}
    public School(int id,String name,int std,String Sname) {
    	super(id,name);
    	this.std=std;
    	this.Sname=Sname;
    }
    public void setStd(int std) {
    	this.std=std;
    }
    public int getStd() {
    	return std;
    }
    public void setSname(String name) {
    	this.Sname=Sname;
    }
    public String getSname() {
    	return Sname;
    }
	
}
class College extends Student{
	//protected 
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
