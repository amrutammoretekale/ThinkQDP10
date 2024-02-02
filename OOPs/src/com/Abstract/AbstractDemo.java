package com.Abstract;
abstract class Language
{
//can have both abstract and concrete methods
	abstract void details();
	void show () {
		System.out.println("Languages");
	}
}
class ProgLanguage extends Language
{
	void details() {
		System.out.println("c++,java,.net,python");
	}
	void display(String name) {
		System.out.println("Institute :"+name);
	}
}
class SpeakingLanguage extends Language{
	void details() {
		System.out.println("englih,french,Spanish");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //we cannot crate object of obstract class
		//language 1=new language();
		
		Language lang;
		lang=new ProgLanguage();
		lang.details();
		//lang.dispay();
		
		lang=new SpeakingLanguage();
		lang.details();
		}

}
