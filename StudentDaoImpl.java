package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.bean.Student;

public class StudentDaoImpl {

	static Student addStudents[];
	Scanner sc = new Scanner(System.in);

	public void addStudents() { 
		System.out.println("How Many Students Are Joining");
		int size = sc.nextInt();
		addStudents = new Student[size];
		for (int i = 0; i < addStudents.length; ++i) {
			System.out.println("Enter Student Number :");
			int sno = sc.nextInt();
			System.out.println("Enter Student Name :");
			String name = sc.next();
			System.out.println("Enter Student Address");
			String sadd = sc.next();
			System.out.println("Enter Mobile Number ");
			long mobile_Number = sc.nextLong();
			System.out.println("Enter Email Id");
			String email = sc.next();
			Student student = new Student(sno, name, sadd, mobile_Number, email);
//		student.setSno(100);
//		student.setSname(name);
//		student.setSadd(sadd);
//		student.setMobileNumber(mobile_Number);
//		student.setEmail(email);
			addStudents[i] = student;

			System.out.println("Studnet " + (i + 1) + "Information Registred");

		} // end of for

	}// addstudentinformation

	public Student[] viewAllStudents() {
		return addStudents;
	}// display student information

	public Student viewStudent(int sno) {

		if(addStudents!=null)
		{
		for (Student stu : addStudents) {
			
			if (stu.getSno() == sno) {
				return stu;
			}
			
		}
		}//end of if
		return null;
	}// display specific student information

}
