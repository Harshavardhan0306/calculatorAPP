import java.util.Scanner;

public class CalculatorApp {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== Simple Java Calculator =====");

            System.out.print("Enter first number: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Invalid input! Please enter a number: ");
                sc.next();
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Invalid input! Please enter a number: ");
                sc.next();
            }
            double num2 = sc.nextDouble();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("✅ Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("✅ Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("✅ Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result))
                        System.out.println("✅ Result: " + num1 + " / " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("❌ Invalid operator! Please use +, -, *, or /.");
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("👋 Thank you for using the Calculator. Goodbye!");
        sc.close();
    }
}
