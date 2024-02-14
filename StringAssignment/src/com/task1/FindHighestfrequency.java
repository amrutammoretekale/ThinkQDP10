package com.task1;
//8.Write a Java program to find highest frequency character in a string.
public class FindHighestfrequency {
	static int findhighestfreq(String s) {
		 int count=0;
			boolean flag;
			char[] ch=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				count=1;
				flag=false;
				
				for(int j=i-1;j>=0;j--) {
					if(s.charAt(i)==s.charAt(j)) {
						flag=true;
						break;
					}
				}
				if(flag==false) {
					for(int k=i+1;k<s.length();k++) {
						if(s.charAt(i)==s.charAt(k))
							count++;
					}
					
					System.out.println(ch[i]+"-->"+count);
			   
				}
			}
			return count;
			
	}
	static void findhighest(String s) {
		int i = 0;
		 char max=(char) findhighestfreq(s);
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)>max) {
				max= s.charAt(i);
			}
		}System.out.println("highest frequency char is:"+max);
	}

	public static void main(String[] args) {
		String str="java";
		//findhighestfreq(str);
		 findhighest(str);

	}

}
