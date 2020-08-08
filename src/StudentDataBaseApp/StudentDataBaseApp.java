package StudentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {
	public static void main(String[] args) {

		// Ask the student User How many students want to add
		System.out.println("Enter Number Of Students");
		Scanner in = new Scanner(System.in);
		int noOfStudent = in.nextInt();
		Student[] stuntents = new Student[noOfStudent];

		// Create n number of Students
		for (int n = 0; n < noOfStudent; n++) {
			stuntents[n] = new Student();
			stuntents[n].enRoll();
			stuntents[n].payment();
		}

		for (int n = 0; n < noOfStudent; n++) {
			System.out.println(stuntents[n].toString());
			System.out.println("----------------------------------");
		}
	}
}
