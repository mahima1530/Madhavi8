package HOMEWORK_8;

import java.util.Scanner;

/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class QUE_6 {
    public static void main(String[] args)

    {
        int a;
        int b;
        int c;
        Scanner B = new Scanner(System.in);
        System.out.print("Input number of rows : ");//declare for loop method
        a = B.nextInt();//declare one int and declare other two int

        for(b=1;b<=a;b++)
        {
            for(c=1;c<=b;c++)
                System.out.print(c);


            System.out.println();
        }
    }
}


