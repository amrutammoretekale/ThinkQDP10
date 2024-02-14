package com.intermidiate;

import java.util.Arrays;

public class SwapMaxAndMinNo {

	static void swapmaxandminno(int arr[]) {
		int max = arr[0];

		int min = arr[0];
		int maxindex = 0;
		int minindex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;

			}
			if (arr[i] < min) {
				min = arr[i];
				minindex = i;
			}

		}
		System.out.println("maximum no is:" + max);

		System.out.println("minimum no is:" + min);

		if (max != min) {
			int temp = arr[minindex];
			arr[minindex] = arr[ maxindex];
			arr[maxindex] = temp;

		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 8, 9, 3, 5 };
		swapmaxandminno(arr);
		System.out.println(Arrays.toString(arr));
	}

}
