// Array stores one type and has fixed length

public class Array {
    public static void main(String[] args) {
		// 				0	1	2	3	4   -> INDEX
		int[] grades = {85, 90, 78, 92, 88}; // 5 elements, plural
		
		// Accessing the value from array
		int grade = grades[2];
		System.out.println("Value of Index [2]: " + grade);
		
		// Get the length of an Array
		int arrayLength = grades.length;
		System.out.println("Array Length: " + arrayLength);
		
		// Get the last element
		int lastElement = grades[arrayLength - 1];
		System.out.println("Last Element: " + lastElement);
		
		// Loops - Display based on length
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		// Assigning value to the array
		grades[2] = 80;
		System.out.println("Change value of [2]: " + grades[2]);
		
		for (int i = 0; i < grades.length; i++) {
			grades[i] += 5;
			System.out.println(grades[i]);
		}
		
		// Index starts from 0
		String[] names = {"John", "Lorem", "Joseph", "Lara", "Rod", "Juriel"};
		
		names[3] = "Gly";
		
		System.out.println("Length: " + names.length);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i]);
		}
		
		// Foreach in Java (Array)
		System.out.println("Foreach Loop -----------------------");
		for (String name : names) {
			System.out.println("Name: " + name);
		}
		
		// Two-dimensional arrays
		int[][] values = {
			{85, 90, 88},
			{78, 82, 80},
			{92, 95, 90}
		};
		
		values[][];
		
		for (int row = 0; row < values.length; row++) {
			
			for (int column = 0; column < values[row].length; column++) {
				
				System.out.print(values[row][column] + " ");
				
			}
			
			System.out.println();
		}
		
    }
}
