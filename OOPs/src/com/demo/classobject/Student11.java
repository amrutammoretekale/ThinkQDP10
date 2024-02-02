package com.demo.classobject;
//state=what object have -vriable
//rollno name
//behaviour -what object does -method
//displayInfo()
public class Student11 {
	int rollno=101;
	String name="pooja";
	public void setDetails() {
		rollno=103;
		name="reena";
	}
	
	public void displayInfo() {
		System.out.println("Rollno:"+rollno);
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student11 s1=new Student11();
        Student11 s2=new Student11();
        Student11 s3=new Student11();
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        s1.displayInfo();
        s2.displayInfo();
        
        s3.setDetails();
        s3.displayInfo();
        
	}

}
