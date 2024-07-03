package com.pace.staticmembers;

public class Customer {
	private int id;
	private String name;
	private float billAmnt;
	public static final String companyName="Amazon";
	
	public  Customer(int id, String name, float billAmnt) {
		super();
		this.id = id;
		this.name = name;
		this.billAmnt = billAmnt;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBillAmnt() {
		return billAmnt;
	}
	public void setBillAmnt(float billAmnt) {
		this.billAmnt = billAmnt;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", billAmnt=" + billAmnt + "]";
	}
	


}
