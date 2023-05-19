package HOMEWORK_8;
/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static

 */
public class QUE_11 {
    public static void main(String[] args) {
        //should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(123456789));
        //should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(252));
        //should return -1 since the number is negative
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int n) {
        int ON = n;//declare original number
        int lD;//declare int as last digit
        int tn1 = 2+4+6+8;
        if (n >= 0) {
            int sumOfEvenDigits = 0;//declare some of value 0
            while (n > 0) {
                lD = n % 10;
                if (lD % 2 == 0) {
                    sumOfEvenDigits += lD;
                }
                n /= 10;

            }
            if (ON >= 0) {
                System.out.println("The sum of even digits within a number"+  ON  +"is equal to:");
                System.out.println(tn1);
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}
