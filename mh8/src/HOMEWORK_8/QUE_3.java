package HOMEWORK_8;

import java.util.Scanner;

/*3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/
public class QUE_3 {
    public static void main(String[] args)
    {
        Scanner sg = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String N = sg.next().toLowerCase();

        boolean uppercase = N.charAt(0) >= 65 && N.charAt(0) <= 90;//Declare alphabet value A and Z
        boolean lowercase = N.charAt(0) >= 97 && N.charAt(0) <= 122;//Declare alphabet value a and z
        boolean vowels = N.equals("a") || N.equals("e") || N.equals("i")
                || N.equals("o") || N.equals("u");//declare vowels a,e,i,o,u

        if (N.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}
