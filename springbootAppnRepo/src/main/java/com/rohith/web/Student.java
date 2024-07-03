package com.rohith.web;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_dtls")
public class Student {

@Id
@Column(name="sid")
private int stdid;
private String stdName;
private double fee;
private String course;
public Student() {
	super();
}
public Student(int stdid, String stdName, double fee, String course) {
	super();
	this.stdid = stdid;
	this.stdName = stdName;
	this.fee = fee;
	this.course = course;
}
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdName=" + stdName + ", fee=" + fee + ", course=" + course + "]";
}


}
