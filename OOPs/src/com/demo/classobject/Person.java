package com.demo.classobject;

public class Person {
	int personid;
	String personname;
	int personage;
	
public void setData(int personid,String personname, int personage) {
	this.personid=personid;
	this.personname=personname;
	this.personage=personage;
}
public void Display() {
	System.out.println("person id:"+personid);
	System.out.println("person name:"+personname);
	System.out.println("person id:"+personage);
	
}

}
