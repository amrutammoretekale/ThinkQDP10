package com.example3;

import java.util.Arrays;

public class Suplier {
private int sid;
private String sname;
private long mobileno;
private Item item[];
public GrossaryShop() {
	super();
	// TODO Auto-generated constructor stub
}
public GrossaryShop(int sid, String sname, long mobileno, Item[] item) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.mobileno = mobileno;
	this.item = item;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public Item[] getItem() {
	return item;
}
public void setItem(Item[] item) {
	this.item = item;
}
@Override
public String toString() {
	return "GrossaryShop [sid=" + sid + ", sname=" + sname + ", mobileno=" + mobileno + ", item="
			+ Arrays.toString(item) + "]";
}

}
