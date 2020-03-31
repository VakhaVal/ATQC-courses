package homework1;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter number 1 (integer)");
            String enteredValue1 = scanner.nextLine();

            try {
                number1 = Integer.parseInt(enteredValue1);
                break;
            } catch (Exception e) {
                System.out.println("Enter an integer, please");
            }
        }

        for (;;) {
            System.out.println("Enter number 2 (integer)");
            String enteredValue2 = scanner.nextLine();

            try {
                number2 = Integer.parseInt(enteredValue2);
                break;
            } catch (Exception e) {
                System.out.println("Enter an integer, please");
            }
        }

        for (;;) {
            System.out.println("Enter number 3 (integer)");
            String enteredValue3 = scanner.nextLine();

            try {
                number3 = Integer.parseInt(enteredValue3);
                break;
            } catch (Exception e) {
                System.out.println("Enter an integer, please");
            }
        }

        System.out.println("Maximum number is " + Math.max(number1, Math.max(number2, number3)));
    }
}
