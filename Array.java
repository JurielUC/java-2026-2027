// Array stores one type and has fixed length

public class Array {
    public static void main(String[] args) {
		// Two-dimensional arrays
		int[][] values = {
			{85, 90, 88},
			{78, 82, 80},
			{92, 95, 90}
		};
		
		for (int row = 0; row < values.length; row++) {
			
			for (int column = 0; column < values[row].length; column++) {
				
				System.out.print(values[row][column] + " ");
				
			}
			
			System.out.println();
		}
		
    }
}
