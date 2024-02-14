package com.forloop1;

public class Test_Continue {
	public static void printNo() {
		for(int i=1;i<=10;i++) {
			if(i==5)
			 continue;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printNo();
	}

}
