package HOMEWORK_8;

import java.util.Scanner;

/*15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *

 */
public class QUE_15 {
    public static void main(String[] args) {

      Scanner TT = new Scanner(System.in);//Declare for loop method

      System.out.print("Enter Right Angled Triangle Pattern Rows:");
        int rows = TT.nextInt();

        System.out.println("Printing Right Angled Triangle Star Pattern");

        for (int N = 1 ; N <= rows; N++ )
        {
            for (int M = 1 ; M <= N; M++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



