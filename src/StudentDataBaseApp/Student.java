package StudentDataBaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalances=0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor:Prommpt user to enter Student Name and Year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		this.firstName = in.next();
		System.out.print("Students LastName: ");
		this.lastName = in.next();
		System.out.println("1-FreshMen\n2-sopmore\n3-Junior\n4-Senior\nEnter the student Class level");
		this.gradeYear = in.nextInt();
		setStudentID();
		System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear + " " + this.studentID);

	}

	// Generate ID
	private String setStudentID() {
		// Generate Level ID
		id++;
		this.studentID = gradeYear + " " + id;
		return studentID;
	}
//Enroll for the Subjects
	public void enRoll() {
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Courses or (Quit for Q)");
			String course = in.nextLine();
			if (!"Q".equalsIgnoreCase(course)) {
				courses = courses +"\n"+ course;
				tutionBalances = tutionBalances + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("Courses "+courses);
	}
	//View Balance
	public void viewBalance()
	{
		System.out.println("Tution balances $ "+tutionBalances);
	}
	//Show status
	public void payment()
	{
		viewBalance();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Payment $ ");
		int payment=in.nextInt();
		tutionBalances=tutionBalances-payment;
		System.out.println("Thank you for your Payment of "+payment);
		viewBalance();
	}
	
	//Show status
	public String toString()
	{
		return "Name: "+firstName+" "+lastName+
				"\nGrade Level:"+gradeYear+
				"\nStudentId"+studentID+
				"\nCourses Enrolled:"+courses+
				"\nBalances:$"+tutionBalances;
	}
}
