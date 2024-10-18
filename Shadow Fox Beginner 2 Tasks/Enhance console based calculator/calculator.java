import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Welcome to the Enhanced Calculator!");

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, ^): ");
            char operator = scanner.next().charAt(0);
1
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    System.out.println("The result is: " + result);
                    break;
                default:
                    System.out.println("Invalid operator! Please try again.");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
