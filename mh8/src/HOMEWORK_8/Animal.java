package HOMEWORK_8;

abstract class Animal {
    // 1. First class

         public void eat(){System.out.println("eating...");}

//2. Second class
     class Dog extends Animal{
         public void bark(){System.out.println("barking...");}
     }
//3. Third class
 class BabyDog extends Dog{
         public void weep(){System.out.println("weeping...");}
     }
//4. Forth class
static class TestInheritance2{
         public static void main(String args[]){

         }}

}
