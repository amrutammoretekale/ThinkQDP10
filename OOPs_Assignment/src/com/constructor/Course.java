package com.constructor;
/*9. 9. Create Course class with id and name. Course also contains SubCourse object which is a
class containing subCourseId, subCourseName. Create default constructor for both and see
each object and object constructor being called one by one. First SubCourse constructor
should be called.
10)Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. 
11). Create Academy class with appropriate attributes (instance variable) and create getter & setter 


*/
	


public class Course {
	   int id;
	   String name;
	   Course(){
		   
	   }
    Course(int subcourseid,String subcourseName){
    	System.out.println("subcourse para....constructor");
    	id=subcourseid;
    	name=subcourseName;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course();

	}

}
