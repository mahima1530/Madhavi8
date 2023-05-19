package HOMEWORK_8;

import java.util.Scanner;

/*14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*

 */
public class QUE_14 {

    public static void main(String[] args) {

        Scanner SS = new Scanner(System.in);
        System.out.println("Enter n:");
        int b = SS.nextInt();
        System.out.println("Enter Symbol:");

        char c = SS.next().charAt(0);
        int i = 1;
        int j;
        j=b-1;
        while(i<=0)
        {
            j=1;
            while(j++<=b-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print(c);

            }

            System.out.println();
            i++;
        }
       i =b-1;
        while(i>0)
        {
            j=1;
            while(j++<=b-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print(c);

            }

            System.out.println();
            i--;
        }

    }
}




