package HOMEWORK_8;
/*22. Multilevel Inheritance Example(Create package name ‘multilevelinheritance23’ and
create all below classes in this package)

 */

 class Animal {
    // 1. First class

         public void eat(){System.out.println("eating...");}}

//2. Second class
     class Dog extends Animal{
         public void bark(){System.out.println("barking...");}
     }
//3. Third class
 class BabyDog extends Dog{
         public void weep(){System.out.println("weeping...");}

}




