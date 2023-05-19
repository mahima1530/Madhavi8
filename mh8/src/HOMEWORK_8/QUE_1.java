package HOMEWORK_8;

import java.util.Scanner;

/*1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.

 */
public class QUE_1 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 10) {

            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = sn.hasNextInt();
            if (!isAnInt) {
                System.out.println("Invalid Value");
                // handle the enter character
                sn.nextLine();
                continue;
            }

            sum += sn.nextInt();
            System.out.println("The sum of numbers: " + sum);
            counter++;
        }

        sn.close();
    }
}


