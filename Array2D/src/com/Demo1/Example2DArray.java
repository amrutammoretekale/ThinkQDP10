package com.Demo1;

public class Example2DArray {

	public static void main(String[] args) {
	int arr[][];
	int rows=3;
	int cols=3;
	arr=new int [rows][cols];
	 int no=1;
	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<cols;j++) {
			 arr[i][j]=no;
			 no++;
		 }
	 }
	
    
	  for(int i=0;i<rows;i++) 
	  {
		  for(int a:arr[i]) {
			  System.out.print(a+" ");
		  }
		  System.out.println();
		  
	  }
	  System.out.println("================");
	
	for(int i=0;i<rows;i++) {
		 for(int j=0;j<cols;j++) {
			 System.out.print(arr[i][j]+" ");
		 } 
		 System.out.println();
	  }

}
}