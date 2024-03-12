package com.inheritance;

class Student{
	protected int id;
	protected String name;
	
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
	protected int std;
	protected String Sname;
	
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
	@Override
	public String toString() {
		return "School [std=" + std + ", Sname=" + Sname + ", id=" + id + ", name=" + name + "]";
	}
    
	
}
class College extends School{
	private int cno;
	private String cname;
	College(){
		
	}
	College(int id,String name,int std,String Sname,int cno,String cname){
		super(id,name,std,Sname);
		this.cno=cno;
		this.cname=cname;
		
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "College [cno=" + cno + ", cname=" + cname + ", std=" + std + ", Sname=" + Sname + ", id=" + id
				+ ", name=" + name + "]";
	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		School s1=new School(1,"Arnav",1233,"DY Patil");
		System.out.println(s1);
		
		College c1=new College(2,"Supriya",4587,"MS School",45,"Dy patil collage");
		System.out.println(c1);
		

	}

}
