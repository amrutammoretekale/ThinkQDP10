package com.constructor;

import java.util.Scanner;

//Write a Java program to create Student class with following details
//data members : rollno,name,sub1,sub2,sub3,sub4,sub5,percentage ,total ,grade
//methods : displayStudents(),calculatePercentage(),calculateGrade,comparePercentage
//(Student)

//Write a test program create two student object and find out who is getting 
//higher percentage
public class Student {
	int rollno;
	String name;
	int sub1,sub2,sub3,sub4,sub5;
	static double per;
	double grade;
	double total;
	
	
	Student(){
		
	}
		
	
	Student(int rollno,String name,double per){
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	public void StudentInfo(int Sub1,int sub2,int sub3,int sub4,int sub5){
	    this.sub1=sub1;
	    this.sub2=sub2;
	    this.sub3=sub3;
	    this.sub4=sub4;
	    this.sub5=sub5;
	}
	public void displayStudent() {
		System.out.println("Student detail");
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("per:"+per);
		System.out.println("total:"+total);
		System.out.println("grade:"+grade);
		System.out.println("sub1:"+sub1);
		System.out.println("sub2:"+sub2);
		System.out.println("sub3:"+sub3);
		System.out.println("sub4:"+sub4);
		System.out.println("sub5:"+sub5);
	

		
	}
	
	public void Calper() {
		total=sub1+sub2+sub3+sub4+sub5;
		 per=(total/5)*100;
		 System.out.println("per:"+per);
	}
	public void CalGrade() {
		if(per>90)
			System.out.println("grade A");
		else if(per>=80)
			System.out.println("grade B");
		else if(per>=70)
			System.out.println("grade C");
		else if(per>=60)
			System.out.println("grade D");
		else if(per>=40)
			System.out.println("garde E");
		else
			System.out.println("grade F");
	}
	
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
	
		
		Student s1 = new Student(101,"Arnav",per);
		s1.StudentInfo(85,88,98,78,87);
		s1.Calper();
		s1.CalGrade();
		s1.displayStudent();
		

	}
	
		
	}


