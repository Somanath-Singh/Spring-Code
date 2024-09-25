package com.nt.beans;

public class Customer {
	
	//cno,cname,billamt are mandatory to participate
	private int cno;
	private String cname;
	private float billamt;
	
	//caddrs,mobno are optional property
	private String addrs;
	private long mobileNo;
	
	
	public Customer(int cno, String cname, float billamt) {
		
		this.cno = cno;
		this.cname = cname;
		this.billamt = billamt;
		
	}


	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billamt=" + billamt + ", addrs=" + addrs + ", mobileNo="
				+ mobileNo + "]";
	}	

	
	
}
