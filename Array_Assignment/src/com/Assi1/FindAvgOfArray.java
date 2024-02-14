package com.Assi1;
//6.  Write two methods that return the average of an array with following headers.
//a.  public static int average(int[] array)
//b.  public static double average(double[] array).
//c.  Write main and invoke the 2 methods.
import java.util.Arrays;
import java.util.Scanner;

public class FindAvgOfArray {
  public static void findavgofarray(int arr[]) {
	  int i;
	  int sum=0;
	  int length=arr.length;
	  int avg1 = 0;
	  for(i=0;i<arr.length;i++) {
		  sum+=arr[i];
		  avg1=sum/length;
		
	  } System.out.println("Avg of array:"+avg1);
	
	
  }
  public static double findavgofarraydouble(double[] arr) {
	  int i;
	  int sum=0;
	  int length=arr.length;
	  int avg1 = 0;
	  for(i=0;i<arr.length;i++) {
		  sum+=arr[i];
		  avg1=sum/length;
		
	  } System.out.println("Avg of array return double:"+avg1);
	return avg1;
  }
  public static int findavgofarrayint(int[] arr) {
	  int i;
	  int sum=0;
	  int length=arr.length;
	  int avg1 = 0;
	  for(i=0;i<arr.length;i++) {
		  sum+=arr[i];
		  avg1=sum/length;
		
	  } System.out.println("Avg of array return int:"+avg1);
	return avg1;
  }
	public static void main(String[] args) {
		    int[] arr=new int[] {1,2,3,4,5};
			findavgofarray(arr);
			double[] arr1=new double[] {1,2,3,4,5};
			findavgofarraydouble(arr1);
			findavgofarrayint(arr);
		}

	}


