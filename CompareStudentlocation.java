package com.te.Assignment;

import java.util.Comparator;

public class CompareStudentlocation implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentLocation.compareTo(o2.studentLocation);
	}
	

}
