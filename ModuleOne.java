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
        Calculator calculator = new Calculator(); // Calculator
        Scanner scanner = new Scanner(System.in); // Input Scanner
        String yesNo; // Yes/No variable, controls the loop

        // start loop
        do {
            System.out.println("Enter an operation: ");
            String operation = scanner.nextLine();

            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int b = scanner.nextInt();

            // continue
        } while (yesNo.toLowerCase() == "yes");
    } // end main
}

class Calculator {
    public int add(int a, int b) {
        try {
            return (a + b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage());
            return 0;
        }
    }

    public int subtract(int a, int b) {
        try {
            return (a - b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage());
            return 0;
        }
    }

    public int multiply(int a, int b) {
        try {
            return (a * b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage());
            return 0;
        }
    }

    public double divide(int a, int b) {
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error - Arithmetic Exception - " + e.getMessage());
            return 0;
        }
    }
} // end class