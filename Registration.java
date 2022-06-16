package sdbms;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		System.out.println("Welcome to SDBMS Project");
		System.out.println("=========================");
		//UPCASTING -> ABSTRACTION
		
		StudentManagementSystem sms = new StudentManagementSystemImpl();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Students\n2. Remove Students\n3. Remove All Students");
			System.out.println("4. Display Students\n5. Display All Students\n6. Count Students");
			System.out.println("7. Update Students\n8. Sort Students\n9. Exit");
			int choice = scn.nextInt();

			switch(choice) {
			case 1:
				sms.addStudent();
				break;
			case 2:
				sms.removeStudent();
				break;
			case 3:
				sms.removeAllStudent();
				break;
			case 4:
				sms.displayStudent();
				break;
			case 5:
				sms.displayAllStudent();
				break;
			case 6:
				sms.countStudent();
				break;
			case 7:
				sms.updateStudent();
				break;
			case 8:
				sms.sortStudent();
				break;
			case 9:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid Choice, Enter a valid Choice");

			}
			System.out.println("=========================================");
		}

	}

}
