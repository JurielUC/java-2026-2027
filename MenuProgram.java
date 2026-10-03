import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Show Message");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Hello, Student!");
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int num1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = input.nextInt();

                    System.out.println("Sum: " + (num1 + num2));
                    break;

                case 3:
                    System.out.println("Keep practicing Java!");
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}