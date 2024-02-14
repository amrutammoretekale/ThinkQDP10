package com.wordlogical;

public class StrinReverse {
	static void findReverse(String st) {
		String revst=" ";
		for(int i=st.length()-1;i>=0;i--) {
			revst=revst+st.charAt(i);
		}
		System.out.println(revst);
	}
	static void findReverseWordByWord(String st) {
		String s[]=st.split(" ");
		String revst="";
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			for(int j=s[i].length()-1;j>=0;j--) {
				revst=revst+s[i].charAt(j);
			}
		}revst=revst+" ";
//		int i;
//		String word=s[i];
//		
//			for(int j=word.length()-1;j>=0;j--) {
//				revst=revst+word.charAt(j);
//			}
//		}
		System.out.println(revst);
	}

	public static void main(String[] args) {
	String str="i like to learn java";
	System.out.println(str);
	findReverse(str);
	System.out.println("-----------");
	findReverseWordByWord(str);

	}

}
