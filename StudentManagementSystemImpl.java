package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;  

public class StudentManagementSystemImpl implements StudentManagementSystem {

	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();
	Scanner scn = new Scanner(System.in);


	@Override
	public void addStudent() {
		System.out.println("Enter Student Id: ");
		int id = scn.nextInt();
		System.out.println("Enter Student Age: ");
		int age = scn.nextInt();
		System.out.println("Enter Student Name: ");
		String name = scn.next();
		System.out.println("Enter Student Marks: ");
		int marks = scn.nextInt();

		Student s = new Student(id, age, name, marks) ;
		db.put(id, s);
		System.out.println("STUDENT RECORD INSERTED SUCCESSFULLY");

	}

	@Override
	public void removeStudent() {
		System.out.println("Enter the Student Id to remove");
		int id = scn.nextInt();
		if(db.containsKey(id)) {
			db.remove(id);

		}
		System.out.println("Removed Student with Id: "+id);

	}

	@Override
	public void removeAllStudent() {
		db.clear();
		System.out.println("Student Records removed successfully");
	}

	@Override
	public void displayStudent() {
		System.out.println("Enter the Student Id to display the details");
		int id = scn.nextInt();
		if(db.containsKey(id)) {
			Student s = db.get(id);
			System.out.println("Id: "+s.getId()+"\nAge: "+s.getAge()+"\nName: " +s.getName()+"\nMarks: "+s.getMarks());
		}


	}

	@Override
	public void displayAllStudent() {

		Set<Integer> s = db.keySet();
		for(int id: s) {
			System.out.println(db.get(id));
		}


	}
 
	@Override
	public void countStudent() {
		System.out.println("No of Student records: "+db.size());

	}

	@Override
	public void updateStudent() {
		System.out.println("Enter Student Id: ");
		int id = scn.nextInt();
		if(db.containsKey(id)) {
			Student s = db.get(id);
			System.out.println("1: Update Age\n 2: Update Marks\n 3: Update Name");
			System.out.println("enter choice");
			int choice = scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Age to Update: ");
				s.setAge(scn.nextInt());
				break;
				
			case 2:
				System.out.println("Enter Marks to Update: ");
				s.setMarks(scn.nextInt());
				break;
				
			case 3:
				System.out.println("Enter Name to Update: ");
				s.setName(scn.next());
				break;
				
			default:
				System.out.println("Invalid choice");
			
			}
		}
		else {
			System.out.println("Student record not available1");
		}
	}

	@Override
	public void sortStudent() {
		
		ArrayList<Student> l = new ArrayList<Student>();
		Set<Integer> s = db.keySet();
		for (Integer id : s) {
			l.add(db.get(id));    // Adding Student objects into ArrayList
		}
		
		System.out.println("1. Sorting by Id\n 2: Sorting by Age ");
		System.out.println("3. Sorting bt Name\n 4. Sorting by Marks");
		System.out.println("Enter choice");
		int choice = scn.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Sorting based on Id");
			Collections.sort(l, new SortStudentById());
			for (Student std : l) {
				System.out.println(std);
			}
			break;
			
		case 2: 
			System.out.println("Sorting based on Age");
			Collections.sort(l, new SortStudentByAge());
			for (Student std : l) {
				System.out.println(std);
			}
			break;
			
		case 3: 
			System.out.println("Sorting based on Name");
			Collections.sort(l, new SortStudentByName());
			for (Student std : l) {
				System.out.println(std);
			}
			break;
			
		case 4: 
			System.out.println("Sorting based on Marks");
			Collections.sort(l, new SortStudentByMarks());
			for (Student std : l) {
				System.out.println(std);
			}
			break;
		}
	}

}
