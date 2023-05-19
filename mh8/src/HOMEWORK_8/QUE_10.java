package HOMEWORK_8;

import java.util.Scanner;

/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153

 */
public class QUE_10 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in) ;
            int t, total = 0;
            System.out.println("Enter any Number : ");
            int num = sr.nextInt();
            int nr = num;

            for (; nr != 0; nr /= 10) {
                t = nr % 10;
                total = total + t * t * t;
            }

            if (total == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
}
