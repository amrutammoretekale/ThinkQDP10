package com.demo.dowhile;
//do while checks conditon last so it run at least one.
public class TestDoWhile {
   
	public static void printNo() {
	  int i=1;
	  do {
		  System.out.println(i);
		  i++;
	  }while(i<=10);
	}
	  public static void displayNo(int n) {
		  int i=1;
		  do {
			  System.out.println(i);
			  i++;
		  }while(i<=n);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         printNo();
         displayNo(50);
	}

}
