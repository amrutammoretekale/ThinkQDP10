package com.covariant;
class One{
	Number value1;
	Number displayvalue1() {
		value1=1;
		return value1;
	}
	Object value;
	Object displayvalue(){
		value=2;
		return value;
	}
}
class Two extends One{
	Number Val;
	Number displayVal() {
		Val=3;
		return Val;
	}
	
}
public class Demo {

	public static void main(String[] args) {
		

	}

}
