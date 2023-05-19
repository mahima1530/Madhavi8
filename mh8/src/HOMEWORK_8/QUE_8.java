package HOMEWORK_8;

import java.util.Scanner;

/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
public class QUE_8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare scanner class

        System.out.print("Enter Right Angled Triangle Pattern Rows:");
        int rw = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Pattern of @");
        int m = 1, z;

        while (m <= rw) {//declare while loop method
            z = 1;
            while (z <= m) {
                System.out.print("@");
                z++;
            }
            System.out.println();
            m++;
        }

    }
}