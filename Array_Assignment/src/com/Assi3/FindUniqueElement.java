package com.Assi3;
//5>> Find the unique elements from char array
public class FindUniqueElement {
	static void findunique(char ar[]) {
		char count=0;
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
				if(count==1)
					System.out.println(ar[ch]);
				
			      
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		char arr[]=new char[] {'A', 'B', 'C', 'A' ,'E', 'B', 'G'};
		findunique( arr);

	}

}
