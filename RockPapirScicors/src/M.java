import java.util.Scanner;

public class M {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("Enter the first number (or 'exit' to quit): ");
                String inputA = scanner.next();

                if (inputA.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }

                double a = Double.parseDouble(inputA);

                System.out.print("Enter the operator (+, -, *, /): ");
                String operator = scanner.next();

                System.out.print("Enter the second number: ");
                double b = scanner.nextDouble();

                double result = performCalculation(a, b, operator);
                System.out.printf("Result: %.2f%n", result);

            } while (true);

            scanner.close();
        }

        public static double performCalculation(double a, double b, String operator) {
            switch (operator) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    if (b != 0) {
                        return a / b;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        return Double.NaN;
                    }
                default:
                    System.out.println("Invalid operator");
                    return Double.NaN;
            }
        }
    }
