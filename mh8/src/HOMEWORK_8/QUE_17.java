package HOMEWORK_8;
/*
17. Carpet Cost Calculator
The Carpet Company has asked you to write an application that calculates the price of carpeting for
rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
the price persquare meter of carpet. For example, the area of the floorthat is 12 meterslong and 10
meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
would cost $960.
1. Write a class with the name Floor. The class needstwo fields(instance variables) with name width
and length of type double.
The class needsto have one constructor with parameters width and length of type double and it
needs to initialize the fields.
In case the width parameter is lessthan 0 it needs to set the width field value to 0, in case the length
parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getArea without any parameters, it needs to return the calculated area
(width * length).
2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
type double.

The class needsto have one constructor with parameter cost of type double and it needsto initialize
the field.
In case the cost parameter islessthan 0 it needsto set the cost field value to 0.

Write the following methods(instance methods):
● Method named getCost without any parameters, it needsto return the value of cost field
3. Write a class with the name Calculator. The class needstwo fields(instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needsto have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needsto initialize the fields.
Write the following methods(instance methods):
● Method named getTotalCost without any parameters, it needsto return the calculated total
cost to cover the floor with a carpet.
4. Write a class with the name Main. The class needsto have a main method.
TEST EXAMPLE
→ TEST CODE: Write below code in main method
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT
total= 38.5
total= 36.45
NOTE: All methodsshould be defined as public NOT public static.
NOTE: In total, you have to write 4 classes.
 */
public class QUE_17 {
    public static class Calculator {
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea() * carpet.getCost();
        }

    }public static class Carpet {
        private double cost;

        public Carpet(double cost){
            if(cost < 0 ){
                this.cost = 0.0;
            }else{
                this.cost = cost;
            }
        }
        public double getCost(){
            return this.cost;
        }
    }
    public static class Floor {
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width > 0 && length < 0) {
                this.width = width;
                this.length = 0.0;
            } else if (width < 0 && length > 0) {
                this.width = 0.0;
                this.length = length;
            } else if (width < 0 && length < 0) {
                this.width = width;
                this.length = length;
            } else {
                this.width = width;
                this.length = length;
            }
        }

        public double getArea() {
            return this.width * this.length;
        }

    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
