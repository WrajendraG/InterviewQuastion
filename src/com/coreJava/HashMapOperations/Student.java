package com.coreJava.HashMapOperations;

public class Student {

	
	private int rollNo;
	private String StudName;
	private Float marks;
	
	
	public Student() {
		
	}
	
	public Student(int rollNo, String studName, Float marks) {
		super();
		this.rollNo = rollNo;
		StudName = studName;
		this.marks = marks;
	}
	


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
	
}
