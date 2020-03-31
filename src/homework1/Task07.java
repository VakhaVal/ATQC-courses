package homework1;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        int arrayLength = 0;
        int[] array;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter length of array (integer)");
            String enteredValue = scanner.nextLine();

            try {
                arrayLength = Integer.parseInt(enteredValue);
                break;
            } catch (Exception e) {
                System.out.println("Enter an integer, please");
            }
        }

        array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            for (; ; ) {
                System.out.println("Enter " + (i+1) + " number (integer) from " + arrayLength);
                String enteredValue = scanner.nextLine();

                try {
                    array[i] = Integer.parseInt(enteredValue);
                    break;
                } catch (Exception e) {
                    System.out.println("Enter an integer, please");
                }
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            sum+=array[i];
        }
        System.out.println("Sum of numbers in array: " + sum);
    }
}
