package com.sms.bean;

public class Student {

	int sno;
	String sname;
	String sadd;
	long mobileNumber;
	String email;

	public Student(int sno, String sname, String sadd, long mobileNumber, String email) {

		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Student() {

	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
