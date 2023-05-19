package HOMEWORK_8;
/*13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static

 */
public class QUE_13 {

    public static void main(String[] args) {
        //should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(12,23));
        //should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(9,99));
        //should return true since the digit 5 appears in both numbers
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit (int one, int two) {

        int e = one % 10;
        int o = two % 10;
        int d = one / 10;
        int w = two / 10;

        if ((one < 10 || one > 99) || (two < 10 || two > 99)) {
            return false;
        } else if (one == two){
            return true;
        } else if (e ==o){
            return true;
        } else if (d == w){
            return true;
        } else if (d == o){
            return true;
        } else if (w == e){
            return true;
        } else {
            return false;
        }
    }
}


