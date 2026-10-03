public class Hello {
	// Two Types
	// 1. return type (datatypes) e.g. int, double, String 
	// -> Expecting return
	// -> return value
	
	// 2. void type (void)
	// -> prints what inside the method
	
	// Method -> format = camelCase
	// Parameter/s Variables inside the parenthesis (num1, num2)
	
	// Return Type (Example)
	public static int sum(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	// Void type (Example)
	public static void userName(String name) {
		System.out.println("My name is "+ name);
	}
	
    public static void main(String[] args) {
		int sumOfTwoNumbers = sum(3, 9);
		System.out.println("Sum of two numbers: "+sumOfTwoNumbers);
		System.out.println("Sum of two numbers (Inline): " + sum(3, 9));
		
		userName("Juriel");
    }
}
