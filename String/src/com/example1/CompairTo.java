package com.example1;

public class CompairTo {

	public static void main(String[] args) {
		//compai lexicographically
		//compairs the unicode of character
		
		//if two String content are exactly same -0
        String s1="Abha";
        String s2="Bibha";
        
        System.out.println(s1.compareTo(s2));//-1
        System.out.println(s2.compareTo(s1));//1
        
        String s3="Rahul";
        String s4="Rahul";
        
        System.out.println(s3.compareTo(s4));//-8
        System.out.println(s4.compareTo(s4));//8
        
        String s5="Rahul";
        String s6="rahul";
        
        System.out.println(s5.compareTo(s6));//-32
        System.out.println(s6.compareTo(s5));//32
        
        
	}

}
