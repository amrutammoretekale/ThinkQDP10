package com.task1;
//Write a Java program to find duplicate  character in given string
public class Duplicate {
static void findduplicate(String s) {
	int count=0;
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println("Duplicate character is:"+ch[i]);
				count++;
			}
			
		}
	}System.out.println("count:"+count);
}
	public static void main(String[] args) {
		String str="amrutamore";
		findduplicate(str);

	}

}
