package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Terminator");
	}

	public void studentId() {
		System.out.println("Student ID id---43");
	}

	public static void main(String[] args) {
		Student we = new Student();
		we.collegeName();
		we.collegeCode();
		we.collegeRank();
		we.deptName();
		we.studentName();
		we.studentId();

	}
}
