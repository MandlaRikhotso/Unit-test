// the same as the group ID provided when creating the maven project structure
package mavenproject;
// for accepting user inputs
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("1 - Add \n2 - Subtract \n3 - Multiply \n4 - Divide");
                System.out.println("Choose operator (0 to exit): ");
                int operator = sc.nextInt();
                if (operator == 0) {
                    System.out.println("Exiting the program...");
                    break;
                }
                System.out.println("Please enter first number : ");
                int number1 = sc.nextInt();
                System.out.println("Please enter second number : ");
                int number2 = sc.nextInt();

                int result = calculate(operator, number1, number2);
                System.out.println("The answer is : " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid user input, please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int calculate(int operator, int number1, int number2) {
        switch (operator) {
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            case 4:
                if (number2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Operator is invalid");
        }
    }
}
