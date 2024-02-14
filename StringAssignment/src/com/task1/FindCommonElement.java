package com.task1;

public class FindCommonElement {
public static void findCommon(String s,String s1) {
	int i,j = 0;
	char ch[]=s.toCharArray();
	for(i=0;i<s.length()-1;i++) {
		for(j=0;j<s1.length()-1;j++) {
			if(s.charAt(i)==s1.charAt(j)) {
			System.out.println("Common element is:"+s.charAt(i)+" "+s1.charAt(j));
		
			}
		}
	}
}
	public static void main(String[] args) {
		
		String str="programming";
		String str1="java";
		findCommon(str,str1);

	}

}
