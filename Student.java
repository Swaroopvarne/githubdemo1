package com.te.Assignment;

public class Student implements Comparable<Student> {
	int studentRollNo;
	String studentName;
	String studentLocation;
	String studentAddress;
	public Student(int rollNo, String studentName, String studentLocation, String studentAddress) {
		
		this.studentRollNo = rollNo;
		this.studentName = studentName;
		this.studentLocation = studentLocation;
		this.studentAddress = studentAddress;
	}
	@Override
	public int compareTo(Student o) {
		return 0;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + studentRollNo + ", studentName=" + studentName + ", studentLocation=" + studentLocation
				+ ", studentAddress=" + studentAddress + "]";
	}
	
	
	
	

}
