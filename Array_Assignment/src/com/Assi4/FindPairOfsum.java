package com.Assi4;
//1>> Find the pair of elements whose sum is equivalent to the given sum
public class FindPairOfsum {
static void findpairofsum(int arr[],int sum) 
{
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,5,2,5,2,3,3};
		int sum=4;
		findpairofsum(arr,sum);

	}

}
