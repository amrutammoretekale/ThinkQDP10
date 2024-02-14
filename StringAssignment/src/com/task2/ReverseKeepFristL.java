package com.task2;
//. WAP to reverse the string word by word keepin first and last as it is
public class ReverseKeepFristL {
	public static void revString(String st) {
		String s[]=st.split(" ");
		String revst=s[0]+" ";
		for(int i=1;i<s.length-1;i++) {
			
			for(int j=s[i].length()-1;j>=0;j--) {
				revst=revst+s[i].charAt(j);
			}
			revst=revst+" ";
		}
		System.out.print("["+revst+""+s[s.length-1]+"]");
    
	}
	public static void main(String[] args) {
		String str = "as big fish is swmming in big river";
		revString(str);
	}

}
