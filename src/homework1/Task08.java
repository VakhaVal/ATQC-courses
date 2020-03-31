package homework1;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        float number1 = 0;
        float number2 = 0;
        String sign;

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter number 1");
            String enteredValue1 = scanner.nextLine();

            try {
                number1 = Float.parseFloat(enteredValue1);
                break;
            } catch (Exception e) {
                System.out.println("Enter a number, please");
            }
        }

        for (;;) {
            System.out.println("Enter an operator (+, -, *, /)");
            sign = scanner.nextLine();

            if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
                break;
            } else {
                System.out.println("Enter an operator, please");
            }
        }

        for (;;) {
            System.out.println("Enter number 2");
            String enteredValue2 = scanner.nextLine();

            try {
                number2 = Float.parseFloat(enteredValue2);
                if (sign.equals("/") && number2 == 0) {
                    System.out.println("Division by zero is impossible. Please, enter another number.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter a number, please");
            }
        }

        if (sign.equals("+")) {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (sign.equals("-")) {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (sign.equals("*")) {
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        } else {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        }

    }
}