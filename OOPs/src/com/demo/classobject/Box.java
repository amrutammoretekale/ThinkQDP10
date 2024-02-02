package com.demo.classobject;

import java.util.Scanner;

//13)Create class Box and calculate the volume of box
//volume=length x width x height
public class Box {
       int length;
       int width;
       int height;
       public void setdetail(int length,int height,int width) {
    	   this.length=length;
    	   this.height=height;
    	   this.width=width;
       }
       public void display() {
    	   System.out.println("length:"+length);
    	   System.out.println("height:"+height);
    	   System.out.println("width:"+width);
    	   
       }
       public void Calvolume() {
    	   int l=4,h=5,w=8 ,volume;
    	   volume=l*w*h;
    	   System.out.println("volume of box:"+volume);
       }
	public static void main(String[] args) {
		
		
		Box b1=new Box();
		b1.setdetail(4, 5, 8);
		b1.display();
		b1.Calvolume();

	}

}
