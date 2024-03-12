package com.TreeMpDemo1;
public class Customer {
	
	private int cid;
	private String name;
	private long mobileNo;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String name, long mobileNo) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNo = mobileNo;
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
