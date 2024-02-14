package com.pattern;

public class Triangle_1_Inc {
    public static void pattern1(int rows){
    	int i,j;
    	for(i=1;i<=5;i++){
    		for(j=1;j<=i;j++) {
    			System.out.print("1 ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    pattern1(5);
	}

}
