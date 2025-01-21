/*
 * Name: Anna Hoerschgen
 * Date: January 21, 2025
 * Filename: ModuleOne.java
 * Assignment: Module 1 - Calculator
*/

// Imports
import java.util.Scanner;

public class ModuleOne {
    public static void main(String[] args) {
        // instantiate reusable objects
        Calculator calculator = new Calculator(); // Calculator object
        Scanner scanner = new Scanner(System.in); // Input Scanner

        // declare reusable variables
        String yesNo; // Yes/No variable, controls the loop
        String operation; // operation type
        int a; // first integer
        int b; // second integer

        // start loop
        do {
            // user selects an operation
            System.out.println("Enter an operation: Addition, Subtraction, Multiplication, Division\n\t");
            operation = scanner.nextLine();

            // user chooses integers
            System.out.println("Enter the first number: \n\t");
            a = scanner.nextInt();
            System.out.println("Enter the second number:\n\t");
            b = scanner.nextInt();

            System.out.println();

            // switch statement
            switch (operation.toLowerCase()) {
                // using toLowerCase() for added ease of use
                case "addition":
                    System.out.println(
                        a
                        + " + "
                        + b
                        + " = "
                        + calculator.add(a, b)
                    );
                    System.out.println("Continue operations? (yes/no)\n\t");
                    yesNo = scanner.nextLine();
                    break;
                case "subtraction":
                    System.out.println(
                        a
                        + " - "
                        + b
                        + " = "
                        + calculator.subtract(a, b)
                    );
                    System.out.println("Continue operations? (yes/no)\n\t");
                    yesNo = scanner.nextLine();
                    break;
                case "multiplication":
                    System.out.println(
                        a
                        + " * "
                        + b
                        + " = "
                        + calculator.multiply(a, b)
                    );
                    System.out.println("Continue operations? (yes/no)\n\t");
                    yesNo = scanner.nextLine();
                    break;
                case "division":
                    System.out.println(
                        a
                        + " * "
                        + b
                        + " = "
                        + calculator.multiply(a, b)
                    );
                    System.out.println("Continue operations? (yes/no)\n\t");
                    yesNo = scanner.nextLine();
                    break;
                default:
                    System.out.println(
                        "Invalid operation "
                        + "\""
                        + operation.toLowerCase()
                        + ".\" Please try again.\nPress any key to continue..."
                    );
                    scanner.nextLine();

                    yesNo = "yes";
                    break;
            }
            System.out.println("\n\n\n");
        } while (yesNo.toLowerCase() == "yes");

        // the program finishes
        System.out.println("\n\nThank you for using the calculator! ^(Ow O)^\nPress any key to close.");
        scanner.nextLine();
        scanner.close();
    } // end main
}

// Calculator class
class Calculator {
    public int add(int a, int b) {
        try {
            return (a + b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage() + " - Please try again.");
            return 0;
        }
    }

    public int subtract(int a, int b) {
        try {
            return (a - b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage() + " - Please try again.");
            return 0;
        }
    }

    public int multiply(int a, int b) {
        try {
            return (a * b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage() + " - Please try again.");
            return 0;
        }
    }

    public double divide(int a, int b) {
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage() + " - Please try again.");
            return 0;
        }
    }
} // end class