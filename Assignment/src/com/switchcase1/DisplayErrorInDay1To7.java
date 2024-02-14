package com.switchcase1;
//6.For any integer input not between 1 to 7 it 
//should display "error, day does not exist"
public class DisplayErrorInDay1To7 {

	public static void main(String[] args) {
		String dayString="";     
		 
		String day = null;
		switch(day) {
		  case "1":dayString= "1 - monday";  
			  
		  case "2":dayString ="2-Tuesday";
			  
		  case "3":dayString ="3-wensday";
			
		  case "4":dayString ="4-Thursday";
			
		  case "5":dayString ="5-Friday";
			  
		  case "6":dayString ="6-Saturday";
			
		  case "7":dayString ="7-Sunday";
		  
		  Default:System.out.println("error, day does not exist");
	}
	}
}
