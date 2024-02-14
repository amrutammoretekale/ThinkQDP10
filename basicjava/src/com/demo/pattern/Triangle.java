package com.demo.pattern;

public class Triangle {
	public static void Triangle() {
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	public static void TrianglewithSpace() {
		  int i,j,k;
		  for(i=1;i<=5;i++) {
			  
		  for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
		  for(j=i;j>=1;j--) {
				System.out.print("*");
				
				}System.out.println();
		}
	}
	public static void Triangle1() {
		int i,j,k;
		  for(i=1;i<=5;i++) {
			  
		  for(k=5;k>=i;k--) {
				System.out.print(" ");
			}
		  for(j=i;j>=1;j--) {
				System.out.print("*");
				
				}System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Triangle();
		 //TrianglewithSpace();
		 Triangle1();

	}

}
