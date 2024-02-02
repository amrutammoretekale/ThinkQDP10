package com.demo.constructor;
class Student1
{
	private int id;
	private String sname;
	private float marks;
	
	Student1()
	{
		System.out.println("Default constructor,.....");
		marks=40f;
		System.out.println(id);
		System.out.println(sname);
		System.out.println(marks);
		
	}
	
	Student1(int id, String sname)
	{
		this();
		System.out.println("Para constructor 2...");
		this.id=id;
		this.sname=sname;
		System.out.println(this.id);
		System.out.println(this.sname);
		System.out.println(this.marks);
		//marks=0.0f;
	}
	
	Student1(int id,String sname,float marks)
	{
		System.out.println("Para constructor 1...");
		this.id=id;
		this.sname=sname;
		this.marks=marks;
	}
	
	Student1(int id,float marks,String sname)
	{
		System.out.println("Para constructor 3...");
		this.id=id;
		this.sname=sname;
		this.marks=marks;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
		
	}
	
	public float getMarks()
	{
		return this.marks; // this.marks= marks
	}
  
	@Override
	public String toString()
	{
		return "Student:"+id+" "+sname+" "+marks;
	}
  


}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student s1= new Student();
//		System.out.println(s1);
//		
		Student1 s2= new Student1(101,"Sumit");
		//System.out.println(s2);
		
//		s2.setMarks(67f);
//		System.out.println(s2);
		
//		
//		Student s3= new Student(102,"Rahul",90f);
//		System.out.println(s3);
//		
//		Student s4= new Student(103,78f,"Amruta");
//		System.out.println(s4);
//		
//		new Student(105,"Mandar");
		
	



	}

}
