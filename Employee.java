package com.main.list;

public class Employee {
	private String ename;
	private String ecity;
	private int eage;
	
	public Employee(String ename, String ecity, int eage) {
		super();
		this.ename = ename;
		this.ecity = ecity;
		this.eage = eage;
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	@Override
	public String toString() {
		return ename;
	}

	

}
