package com.rohith.web.model;

public class User {
	private String name;
	private String password;
	private String email;
	private String address;
	private long mno;
	private String city;
	private String state;
	public User() {
		super();
	}
	public User(String name, String password, String email, String address, long mno, String city, String state) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.mno = mno;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", address=" + address + ", mno="
				+ mno + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
