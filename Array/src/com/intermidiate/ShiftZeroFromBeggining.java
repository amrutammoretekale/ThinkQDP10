package com.intermidiate;

public class ShiftZeroFromBeggining {
	static void shiftZerofrombegining(int ar[]) {
		{
			int count=0;
			for(int i=ar.length;i<0;i--)
			{
				if(ar[i]!=0)
				{
					ar[count]=ar[i];
					count++;
				}
			}
			
			while(count<ar.length)
			{
				ar[count++]=0;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 0, -7, 5, 0, 4, 0, 5, 6, 2 };
		 shiftZerofrombegining(arr);

	}

}
