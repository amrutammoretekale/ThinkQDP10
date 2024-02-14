package com.task2;

public class FindMostRepetedWord {
	static void findmostreapetedword(String st) {
		String s[]=st.split("\\s");
		
		int count = 0;
		String max=s[0];
		boolean status;
		for(int i=0;i<s.length;i++) {
			count=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(s[i].equals(s[k])) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int j=i+1;j<s.length;j++) {
					if(s[i].equals(s[j])) {
						count++;
					}
				}
				if(count>1) {
					
					max=s[i];
				}
			}
			
		}System.out.println("Most reapeted char:"+max);
	}

	public static void main(String[] args) {
		String str="a big cat rolling on big mat big ";
		findmostreapetedword(str);

	}

}
