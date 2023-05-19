package HOMEWORK_8;

abstract class Shape {
        public abstract void draw();
    }
 //1.first class
    class Rectangle extends Shape{
        public void draw(){System.out.println("drawing rectangle");}
    }
//2.second class
    class Circle1 extends Shape{
        public void draw(){System.out.println("drawing circle");}
    }
//3.third class
    //In real scenario, method is called by programmer or user
    class TestAbstraction1{
        public static void main(String args[]){

            Shape s=new Circle1();//In a real scenario, object is provided through
            s.draw();

}}
