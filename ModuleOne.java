/*
 * Name: Anna Hoerschgen
 * Date: January 21, 2025
 * Filename: ModuleOne.java
 * Assignment: Module 1 - Calculator
*/

public class ModuleOne {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
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
}