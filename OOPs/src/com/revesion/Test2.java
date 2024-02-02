package com.revesion;
class Student{
	// instance variable
	 int x=1;
	static int y=2;//static vaiable
	
	

Student(){
	System.out.println(x);
	System.out.println(y);
	x++;
	y++;
}
static{
	Student s1=new Student();
	System.out.println(s1.x);
	System.out.println(y);
}

}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println(s1.x);
		Student s2=new Student();
		System.out.println(s2.y);

	}

}
