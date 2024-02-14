package com.task1;

public class FindrevString {
	static void revstring(String s) {
		String revst="";
		for(int i=s.length()-1;i>=0;i--) {
			revst=revst+s.charAt(i);
		}
		System.out.println(revst);
			
		
	}

	public static void main(String[] args) {
     String str="programming";
     revstring(str);
	}

}
