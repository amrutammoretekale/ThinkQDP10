package com.exxample1;

public class MarksInDesOrder {
  static void sortMarks(Student st[]) {
	  Student stemp=new Student();
	  for(int i=0;i<st.length;i++) {
		  for(int j=i+1;j<st.length;j++) {
			  if(st[i].getMarks()<st[j].getMarks());
			  {
				  stemp=st[i];
				 st[i]=st[j];
				 st[j]=stemp;
			  }
		  }
	  }
  }
	public static void main(String[] args) {
		

	}

}
