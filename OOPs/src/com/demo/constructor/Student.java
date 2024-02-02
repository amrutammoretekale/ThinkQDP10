package com.demo.constructor;

     public class Student {
	       private int studid;
	       private String studname;
	       private double studmarks;
	   
	 public Student(int studid,String studname,double studmarks) {
		 this.studid=studid;
		 this.studname=studname;
		 this.studmarks=studmarks;
		 
	 }
	 public Student() {
		 
	 }
	 public void setStudentid(int studid) {
		 this.studid=studid;
	 }
	 public int getstudid() {
		 return studid;
	 }
	 public void setStudentname(String studname) {
		 this.studname=studname;
	 }
	 public String getStudname() {
		 return studname;
	 }
	 public void setStudentmarks(double studmarks) {
		 this.studmarks=studmarks;
	 }
	 public double getstudmarks() {
		 return studmarks;
	 }
	 public String toString() {
		 //return "hello";
		 return "student id:"+studid+" studnmae:"+studname+" studmarks:"+studmarks;
	 }
	 
	 
	
	

}
