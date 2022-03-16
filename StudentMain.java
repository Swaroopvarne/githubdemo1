package com.te.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		boolean flag=true;
		System.out.println("Press '1' - compare by RollNo");
		System.out.println("Press '2' - compare by Name");
		System.out.println("Press '3' - compare by Location");
		System.out.println("Press '4' - compare by Address");

		ArrayList<Student> arrayReferance = new ArrayList<Student>();

		arrayReferance.add(new Student(213, "swaroop", "Bengalore", "GandhiNagar"));
		arrayReferance.add(new Student(234, "satish", "Mumbai", "ChordRoad"));
		arrayReferance.add(new Student(578, "bharath", "Tumkur", "Rajajinagar"));
		arrayReferance.add(new Student(135, "kartik", "Andra", "Maruthinagar"));

		Scanner refcan = new Scanner(System.in);

		do {
			System.out.println("enter your Choice");
			int pick = refcan.nextInt();

			switch (pick) {
			case 1:
				System.out.println("Soted by RollNo");
				Collections.sort(arrayReferance, new CompareRollNo());
				for (Student student1 : arrayReferance) {
					System.out.println(student1);
				}
				break;

			case 2:
				System.out.println("Sorted by Name");
				Collections.sort(arrayReferance, new CompareStudentName());
				for (Student student2 : arrayReferance) {
					System.out.println(student2);
				}
				break;
			case 3:
				System.out.println("Sorted by location");
				Collections.sort(arrayReferance, new CompareStudentlocation());
				for (Student student3 : arrayReferance) {
					System.out.println(student3);
				}
				break;
			case 4:
				System.out.println("Sorted by address");
				Collections.sort(arrayReferance, new CompareStudentAddress());
				for (Student student4 : arrayReferance) {
					System.out.println(student4);
				}
				break;
			default:
				System.out.println("please Enter Number");
					continue;
			}
			Scanner scan1=new Scanner(System.in);
			System.out.println("Do you want to continue");
			
			String str1= scan1.next();
			if (str1.equalsIgnoreCase("Y")) {
				flag = true;
			}
			else if(str1.equalsIgnoreCase("N"))
			{
				System.exit(0);
			}else {
				System.out.println("enter correct choice");
			}
		} while (flag);
	}
}
