package com.Assi3;
//6>> Find frequency of each element from char array
public class Frequency {
	static void findfrequency(char ar[]) {
		char count;
		boolean status;
		for(char ch=0;ch<ar.length;ch++) {
			char count1=1;
			status=false;
			//cheack if the element is new
			for(char ch1= (char) (ch-1);ch1>=0;ch1--) {
				if(ar[ch]==ar[ch1]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(char ch2=(char) (ch+1);ch2<ar.length;ch2++) {
					if(ar[ch]==ar[ch2])
						count1++;
				}
				//frequency
				System.out.println(ar[ch]+"-->"+count1);
				
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
		char arr[]= {'A','B','C','D','E','F','A'};
		findfrequency(arr);

	}

}
