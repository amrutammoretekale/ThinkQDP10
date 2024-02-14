package com.task2;

//. WAP to remove all the duplicate words from a string
public class RemoveDuplicate {
	static void removeDuplicate(String st) {
		String s[] = st.split(" ");
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				continue;
			}
			boolean flag=true;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])){
					flag=false;
					s[j]=null;
				}
			}
			if(flag) {
				System.out.println(s[i]+" ");
				
			}
		}		
	}

	public static void main(String[] args) {
		String str = "a big fish is swmming in big river";
		removeDuplicate(str);
	}

}
