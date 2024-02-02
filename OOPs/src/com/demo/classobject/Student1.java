package com.demo.classobject;

import java.util.Scanner;

/*1. create class Student
2. create 2 objects of Student using new keyword
3) Write a program for class and object : (main method inside class)
4) Write a program for class and object : (main outside class)
5) Write a program for class and object : (initialization through reference)
Note : Initializing object simply means storing data into objec
6) Write a program to demonstrate anonymous object.
7) Write a program to create multiple objects of one type only.
e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two object
10. add id,name in student class. assign value to id name there
itself and in main method print values. Then change value
of instance variables and again print the values. Observe
you cannot access id directly without creating object. Also
2 objects have 2 seperate set of data
11. From scanner In loop (for 2 iterations) read Student
data create new object each time assign values and print
student values in console
12) Write a program to copy values of one object into another by assigning the values of
one object into another*/
public class Student1 {
	
	
		 int id;
		String name;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         Student1 s1=new Student1();
         Student1 s2=new Student1();
         
         s1.id=101;
         s1.name="Arnav";
         
        System.out.println(s1.id);
        System.out.println(s1.name);
         //anonymous object
        new Student1();
        
        Student1 s3=new Student1(),s4=new Student1();
        System.out.println(s3.id);
        System.out.println(s3.name);
         
        int i;
        for(i=1;i<=2;i++) {
        	System.out.println("Enter id:");
        	s1.id=sc.nextInt();
        	System.out.println("Enter name:");
        	s1.name=sc.next();
        	System.out.println("id: "+s1.id+" name: "+s1.name);
        	
        }
         
	}

}
