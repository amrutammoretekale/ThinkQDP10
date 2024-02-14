package com.Lab.ConditionalStatement;

public class LogicalOperatorPrsidanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exp>4years,2years programexp,cgpa>5.5
    int exp=3;
    int proexp=3;
    double cgpa=5.5;
   /* if(exp>=4 && (proexp>=2 || cgpa>=5.5)) {
    	System.out.println("you are pass for interview");
    	
    }else {
    	System.out.println("You are no pass for interview");
    }*/
    
    if(proexp>=2 || cgpa>=5.5 &&!(exp>=4)) {
    	System.out.println("you are pass for interview");
    	
    }else {
    	System.out.println("You are no pass for interview");
    }
	}

}
