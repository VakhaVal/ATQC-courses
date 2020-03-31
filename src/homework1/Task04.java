package homework1;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        int number = 0;

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter a number (integer)");
            String enteredValue1 = scanner.nextLine();

            try {
                number = Integer.parseInt(enteredValue1);
                break;
            } catch (Exception e) {
                System.out.println("Enter an integer, please");
            }
        }

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
