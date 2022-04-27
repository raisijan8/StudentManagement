package com.sms.details;

import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.client.StudentClient;
import com.sms.dao.impl.StudentDaoImpl;

public class StudentDetails {

	Scanner sc = new Scanner(System.in);
	StudentDaoImpl daoImpl = new StudentDaoImpl();

	public void stuMenu() {

		while (true) {
			System.out.println("******************************************");
			System.out.println("              1)AddStudents               ");
			System.out.println("              2)ViewAllStudents           ");
			System.out.println("              3)ViewStudent               ");
			System.out.println("              4)Back                      ");
			System.out.println("******************************************");

			System.out.println("Enter The Choice :");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				daoImpl.addStudents();
				stuMenu();
			case 2:
				Student viewStudents[] = daoImpl.viewAllStudents();
				System.out.println("**************************************************************");
				System.out.println("SNO \t SNAME \t SADD \t MOBILEnUMBER \t EMAIL");
				System.out.println("**************************************************************");
				if(viewStudents!=null)
				{
				for (Student stu : viewStudents) {
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t"
							+ stu.getMobileNumber() + "\t" + stu.getEmail());
				}
				}//end of if
				else
				{
					System.out.println("Student Information is not Avilable");
				}
				stuMenu();
				break;
			case 3:
				System.out.println("Enter Student Number : ");
				Student stu = daoImpl.viewStudent(sc.nextInt());

				if (stu != null) {
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t"
							+ stu.getMobileNumber() + "\t" + stu.getEmail());

				} else {
					System.out.println("Student Record is Not Avilable");
				}
				stuMenu();
				break;
			case 4:
				StudentClient.main(null);
			default:
				System.out.println("Choose 1 to 4 Between");

			}// end of switch
		} // end of while
	}
}
