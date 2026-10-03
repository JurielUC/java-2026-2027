/*
	Create a program that 
	[DONE] 1. accepts a student's name and three grades, 
    [DONE] 2. calculate the average (utilize method), 
	[DONE] 3. then print "Passed" or "Failed" - Remarks (utilize method)
	[DONE] 4. Print result = Name, Average, Remarks (Utilize method with void type)
*/

import java.util.Scanner;

public class GradeCalculator {
	static double calculateAverage(double grade1, double grade2, double grade3) {
		double average = (grade1 + grade2 + grade3) / 3;
		
		return average;
	}
	
	static String getRemarks(double average) {
		// Passing Grade = 75
		return (average >= 75) ? "Passed" : "Failed";
	}
	
	static void results(String name, double average, String remarks){
		System.out.printf("Name: %s%n", name);
		System.out.printf("Average: %.2f%n", average);
		System.out.printf("Remarks: %s", remarks);
	}
	
    public static void main(String[] args) {
		// 1.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Grade 1: ");
		double grade1 = input.nextDouble();
		
		System.out.print("Enter Grade 2: ");
		double grade2 = input.nextDouble();
		
		System.out.print("Enter Grade 3: ");
		double grade3 = input.nextDouble();
		
		// 2.
		double average = calculateAverage(grade1, grade2, grade3);
		
		// 3.
		String remarks = getRemarks(average);
		
		// 4. Print results = Name, Average, Remarks (Utilize method with void type)
		results(name, average, remarks);
		
		input.close();
    }
}
