package com.queueDemo;

import java.util.Comparator;

import com.arraylistdemo.EmployeeIdComparator;

public class BookPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return (int) (o1.price-o2.price);
	}

}
