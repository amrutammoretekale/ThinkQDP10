package com.covariant;
class First{
//	Number value;
//	Number displayvalue() {
//		value=10;
//		return value;
//	}
	Object Value;
	Object displayValue() {
		Value=10;
		return Value;
	}
}
class Second extends First{
	Integer myVal;
	
	Integer displayValue() {
		myVal=20;
		return myVal;
	}
}
class Third extends First
{
	Character ch;
Character displayVlue() {
	ch='A';
	return ch;
}	

}

public class CovariantwrapperDemo {

	public static void main(String[] args) {
		First f1;
		f1= new First();
		System.out.println("Number is:"+f1.displayValue());
		
		//f1= new Second();
		//System.out.println("Result is:"+((int)(f1.displayValue())+10));
		
		Second s1= new Second();
		System.out.println("Result is:"+(s1.displayValue()+10));
		
		
	}

	}


