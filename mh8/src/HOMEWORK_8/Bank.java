package HOMEWORK_8;

 class Bank {
    //Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.
//Creating a parent class.

        public int getRateOfInterest(){return 0;}

    //Creating child classes.
    class SBI extends Bank{
        public int getRateOfInterest(){return 8;}
    }
    class ICICI extends Bank{
        public int getRateOfInterest(){return 7;}
    }
    class AXIS extends Bank{
        public int getRateOfInterest(){return 9;}
    }
    //Test class to create objects and call the methods
    static class Test2{
        public static void main(String args[]){


        }
    }
}
