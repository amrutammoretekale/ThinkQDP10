package com.final_DynamicDispatch_Covairennt;
//Create a code to show the uage of super keyword
class Student{
	protected int id;
	protected String name;
	
	Student(){
		
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println(name+" "+id);
	}
}
class Stud extends Student{
	protected int Sid;
	protected String Sname;
	
	Stud(){
		
	}
	Stud(int id,String name,int Sid,String Sname){
		super(id,name);
		this.Sid=Sid;
		this.Sname=Sname;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	void display() {
		System.out.println("Sname:"+Sname+" "+"Sid:"+Sid+" "+"id:"+id+" "+"name:"+name);
	}
}
public class Show_SuperKeyword {

	public static void main(String[] args) {
		Student s1=new Student(101,"Arnav");
		s1.display();
		Stud s2=new Stud(102,"ArnavT", 103, "Tekale");
       s2.display();
	}

}
