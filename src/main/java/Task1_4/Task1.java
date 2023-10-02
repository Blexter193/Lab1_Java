package Task1_4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter 1 number: ");
            double a = Double.parseDouble(scan.nextLine());

            System.out.print("Enter an operation (+, -, *, /): ");
            String operator = scan.nextLine();

            System.out.print("Enter 2 number: ");
            double b = Double.parseDouble(scan.nextLine());

            double result;

            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("You can't divide by 0!");
                    }
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation sign!");
            }

            System.out.println("Result: " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid numbers.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scan.close();
        }

    }
}
