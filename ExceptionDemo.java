// Custom Checked Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method that throws a custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {

        // 1. Runtime Exception (Unchecked)
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Division attempt completed");
        }

        System.out.println("-------------");

        // 2. Checked Exception (Custom)
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("Program ended safely");
    }
}