package com.revature.entity;
import java.util.*;
public class AccDetails {


	private int id;
	private String user_name;
	private String phone_no;
	private String aadhar;
	private String address;
	private String dob;
	private double balance;

	public AccDetails(String user_name, String phone_no, String aadhar, String address,String dob, double opening_balance) {
		super();
	//	this.id = id;
		this.user_name = user_name;
		this.phone_no = phone_no;
		this.aadhar = aadhar;
		this.address = address;
		this.dob=dob;
		this.balance = opening_balance;
	}
	
	public AccDetails() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getaadhar() {
		return aadhar;
	}
	
	public void setaadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		this.dob=dob;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccDetails [id :" + id + ", user_name : " + user_name + ", phone_no : " + phone_no +",aadhar :"+ aadhar +", address : "+address+", balance : " +balance+"]";
}

}