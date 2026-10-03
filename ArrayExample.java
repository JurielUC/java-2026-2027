public class ArrayExample {
    public static void main(String[] args) {
		
        int array1[] = new int[5]; // {0, 0, 0, 0, 0}
		String[] names = {"Maurice", "John", "Fatima", "Gerald", "Arjonel", ""};
		
		// Access
		// System.out.println(names[1]);
		
		// Assign
		names[5] = "Juriel";
		// System.out.println(names[5]);
		
		// For Each Loop
		for (String name : names) {
			System.out.println(name);
		}
    }
}
