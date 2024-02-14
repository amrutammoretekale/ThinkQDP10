package com.Assi1;

public class Frequency {
	static void findfrequency(int ar[]) {
		int count;
		boolean status;
		for(int i=0;i<ar.length;i++) {
			count=1;
			status=false;
			//cheack if the element is new
			for(int j=i-1;j>=0;j--) {
				if(ar[i]==ar[j]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int k=i+1;k<ar.length;k++) {
					if(ar[i]==ar[k])
						count++;
				}
				//frequency
				System.out.println(ar[i]+"-->"+count);
				
//				dupplicatr
//				if(count>1)
//				{
//					System.out.println(ar[i]);
//				}
//				//uniue
//				if(count==1)
//					System.out.println(ar[i]);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,2,4,5,6,5,7};
		findfrequency(arr);

	}

}
