package com.te.Assignment;

import java.util.Comparator;

public class CompareRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentRollNo - o2.studentRollNo;
	
	}

	
}
