package com.example1;

public class CountCharacters {
	static int findchars(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			count++;
		}
//		for(int i=0;i<ch.length;i++) {
//			count++;
//		}
		return count;
	}

	static void findvowelsConsonanat(String s) {
		int vcount=0;
		int ccount=0;
		s=s.toUpperCase();
		char ch[]=s.toCharArray();
		
		for(char c:ch) {
			//omit spces and dot
			if(c==' '|c=='.') {
				continue;
			}
			//System.out.print(c);
			if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U'){
				vcount++;
			} 
			else {
				ccount++;
			}
				
				
			
		}
		System.out.println("number of vowes:"+vcount);
		System.out.println("number of Consonant:"+ccount);
	}
	public static void main(String[] args) {
		String str="programming is fun.java is fun";
		System.out.println("find no of character"+findchars(str));
		//System.out.println(str.length());
		System.out.println(str);
		findvowelsConsonanat(str);
	}

}
