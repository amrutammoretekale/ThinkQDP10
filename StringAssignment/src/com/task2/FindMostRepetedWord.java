package com.task2;

import java.util.Arrays;

public class FindMostRepetedWord {
	static void findmostreapetedword(String st) {
		String[] s=st.split("\\s");
		int i;
		int max[]=new int[2];
		String maxct[]=new String[2];
		
		int count = 0;
		String max1=s[0];
		int maxindex=0;
		int index=0;
		boolean status;
		for(i=0;i<s.length;i++) {
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
					
					max[maxindex++]=count;
					
					maxct[index++]=s[i];
				}
			}
			
		}System.out.println("Most reapeted char:"+Arrays.toString(maxct));
	}

	public static void main(String[] args) {
		String str="a big cat rolling on big mat big cat ";
		findmostreapetedword(str);

	}

}
