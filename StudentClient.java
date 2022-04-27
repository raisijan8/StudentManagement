package com.sms.client;

import java.util.Scanner;

import com.sms.details.StudentDetails;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("******************************************");
			System.out.println("              1)Student                   ");
			System.out.println("              2)Exit                      ");
			System.out.println("******************************************");

			System.out.println("Enter The Choice ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StudentDetails details = new StudentDetails();
				details.stuMenu();
				break;
			case 2:
				System.out.println("Thx for using App!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 2 Between");

			}// end of switch

		}

	}

}
