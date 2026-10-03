/*
	Create a program that; (tickets)
	[DONE] 1. Accepts a student name, and three grades
	[DONE] 2. Calculates the average
	[DONE] 3. Determine whether the student "Passed" or "Failed"
	[DONE] 4. Displays the result: NAME, Average, Remark (USE VOID TYPE)
*/

import java.util.Scanner;

public class AverageCalculator {
	static double calculateAverage(double grade1, double grade2, double grade3) {
		double average = (grade1 + grade2 + grade3) / 3;
		return average;
	}
	
	// No parameters, no return value
	static void firstCat() {
		System.out.println("1. No parameters, no return value")
	}
	
	// No parameters, with a return value
	static int secondCat() {
		return 1;
	}
	
	// With parameters, no return value
	public static void result(String name, double average, String remark) {
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Remark: " + remark);
	}
	
	// With parameters, with a return value
	static String getRemarks(double average) {
		// Passing grade is 75
		return (average >= 75) ? "Passed" : "Failed";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Grade 1: ");
		double grade1 = input.nextDouble();
		
		System.out.print("Enter Grade 2: ");
		double grade2 = input.nextDouble();
		
		System.out.print("Enter Grade 3: ");
		double grade3 = input.nextDouble();
		
		double average = calculateAverage(grade1, grade2, grade3);
		String remark = getRemarks(average);
	
		result(name, average, remark);
	}
}