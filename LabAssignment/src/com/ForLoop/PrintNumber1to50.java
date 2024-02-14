package com.ForLoop;

public class PrintNumber1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i;
      for(i=1;i<=50;i++) {
    	  if(i%3==0 && i%5==0) {
    		  System.out.println("Welcome");
    	  }else if(i%3==0) {
    		  System.out.println("Hello");
    	  }else if(i%5==0){
    		  System.out.println("Bye");
    		  
    	  }
    	  else
    		  System.out.println(i)  ;
    	   	
    	    
      }
      }
	}


