package com.te.Assignment;

import java.util.Comparator;

public class CompareStudentAddress implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentAddress.compareTo(o2.studentAddress);
	}
	

}
