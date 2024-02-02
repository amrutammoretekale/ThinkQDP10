package com.demo.classobject;

public class Book {
	// instnce variable
    int bookid;
    String bookname;
    double bookprice;
    
    public void readbook() {
    	System.out.println(" read bbo instance method");
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Book().bookid);
		System.out.println(new Book().bookname);
		System.out.println(new Book().bookprice);
		
		//by ref variable
		//ref var=b1
		
		Book b1=new Book();
		System.out.println(b1.bookid);
		System.out.println(b1.bookname);
		System.out.println(b1.bookprice);
		
		b1.readbook();

	}

}
