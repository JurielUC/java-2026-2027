/* 
	RECURSIVE METHOD (RECURSION)
	- Recursion is when a method calls itself until it reaches a stopping condition
	
	Context: Factorial - Multiplying a positive whole number by 
	all the positive whole numbers below it.
	
	Two Important Parts
	1. Base Case - tells the method when to stop
	2. Recursive Case - the method calls itself with a smaller/simple value
*/

public class RecursiveFunction {

    public static int factorial(int n) { // 5
		System.out.println("factorial(" + n + ")");
		
        // Base case
        if (n == 1) {
			System.out.println("Reached the base case \n\n");
            return 1;
        }

        // Recursive case
		int result = n * factorial(n - 1);
		
		System.out.println("Returning: " + n + " * factorial("+ (n - 1) +") = "+ result);
		
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
		
		System.out.println("Calculating factorial of " + number);
		System.out.println();

        int result = factorial(number);
		
		System.out.println();
        System.out.println("Factorial of " + number + " is " + result);
    }
}