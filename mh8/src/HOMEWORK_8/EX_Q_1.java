package HOMEWORK_8;

import java.util.Scanner;

/*/Write a “main” method into main class. It has scanner that takes user  input.
 Also write the logic that it ask user to “Enter first Number:”,
  “Enter second Number:” “Please enter one of symbol +,-,, /:” if user  enter + symbol result like
   “Addition of 5 and 10 is: 15”
and respective  for other symbol.
 */
public class EX_Q_1 {
    public static class Numbers {
        public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            int first;
            int second;

            System.out.println("Input first number");
            first = sn.nextInt();
            System.out.println("Input second number");
            second = sn.nextInt();

            System.out.printf("Your numbers are: %d and %d\n", first ,second );
            System.out.println("Addition of" + (first) + "and" + (second) + "is:" + (first+second));
            sn.close();
        }
    }}
