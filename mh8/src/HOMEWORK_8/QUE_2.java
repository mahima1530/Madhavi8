package HOMEWORK_8;

import java.util.Scanner;

/*2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.

 */
public class QUE_2 {
    public static void main(String[] args) {
        Scanner co = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = co.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (number == 0) {

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }


            System.out.println("maximum number: " + max);
            System.out.println("minimum  number: " + min);
        }
    }
}