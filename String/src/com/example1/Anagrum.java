package com.example1;

import java.util.Arrays;

public class Anagrum {
	static void sortArray(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temps=ch[i];
					ch[i]=ch[j];
					ch[j]=temps;
				}
			}
		}
	}
	static boolean checkAnagrum(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
			else {
				s1=s1.toLowerCase();
				System.out.println(s1);
				
				s2=s2.toLowerCase();
				System.out.println(s2);
				
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				
				sortArray(c1);
				System.out.println(c1);
				
				sortArray(c2);
				System.out.println(c2);
				
				for(int i=0;i<c1.length;i++) {
					if(c1[i]!=c2[i])
						return false;
				}
			}
		
		
		return true;
		
	}
	static boolean checkAnagrum2(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		else
		{
			s1=s1.toLowerCase();
			System.out.println(s1);
			
			s2=s2.toLowerCase();
			System.out.println(s2);
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			Arrays.sort(c1);
			//System.out.println(c1);
			
			Arrays.sort(c2);
			//System.out.println(c2);
			
			if (Arrays.equals(c1, c2)) {
				return true;
			}
				else
					return false;
			}
		}
		
	

	public static void main(String[] args) {
		String str="Race";
		String str1="race";
		
		checkAnagrum(str,str1);
		
		checkAnagrum2(str,str1);

	}

}
