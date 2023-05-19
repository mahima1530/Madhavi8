package HOMEWORK_8;

import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17... are the prime numbers.)*/
public class QUE_12 {
    public static void main(String[] args) {
        int p;
        boolean isPrime=true;
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=sn.nextInt();
        sn.close();
        for(int i=2;i<=num/2;i++)
        {
            p=num%i;
            if(p==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
    }
