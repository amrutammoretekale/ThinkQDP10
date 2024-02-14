package com.example1;

public class palindrom {
      static boolean checkpalindrome(String s) {
    	  //using temprry array
    	  System.out.println(s);
    	  String rev="";
    	  for(int i=s.length()-1;i>=0;i--) {
    		  rev=rev+s.charAt(i);
    	  }
    	  System.out.println(rev);
    	  if(s.equalsIgnoreCase(rev))
    	   return true;
    	    else
    		  return false;
      }
      static boolean checkpalindrom2(String s) {
    	  //without temprary String
    	  s=s.toLowerCase();
    	  for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
    		  if(s.charAt(i)!=s.charAt(j))
    			  return false;
    	  }
		return true;
      }
	public static void main(String[] args) {
		String str="Malayalam";
		if( checkpalindrome(str)) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is a not palindrome");
		}

	}

}
