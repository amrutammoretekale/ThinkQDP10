package com.demo.whileloop;

import java.util.Scanner;

public class Start_Stop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int start,end;
System.out.println("Enter Start");
start=sc.nextInt();
System.out.println("Enter End");
end=sc.nextInt();
while(start<=end) {
	System.out.println(start);
	start++;
}
	}

}
