package StudentManagment;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Priorities priorities = new Priorities();
		
		//Menu DRiven Approach
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1-->Add_Student");
			System.out.println("2-->Serve_Student");
			System.out.println("3-->Get_Unserved_Students");
			System.out.println("4-->Exit");
			System.out.println("Enter Your Choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter student Name:");
				String name = sc.next();
				System.out.print("Enter student CGPA:");
				double cgpa = sc.nextDouble();
				priorities.addStudent(name, cgpa);
				System.out.println("Student added");
				break;
				
			case 2:
				priorities.serveStudent();
				System.out.println("Student served");
				break;
			
			case 3:
				List<Student> unservedStudents = priorities.getUnservedStudent();
				System.out.println("Unserved students");
				for(Student student:unservedStudents) {
					System.out.println("ID"+student.getId() +
							", Name:"+student.getName() +
							", CGPA: "+student.getCGPA());
				}
				break;
				
			case 4:
				System.out.println("Exiting...");
				System.exit(0);
			
		    default:
		    	System.out.println("Invalid choice");
		    	break;
			}
			
		}
	}

}
