package HOMEWORK_8;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulations obj = new Encapsulations();
// setting values of the variables
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);

// Displaying values of the variables
        System.out.println("CodeBusters name: " + obj.getName());

        System.out.println("CodeBuster age: " + obj.getAge());

        System.out.println("CodeBuster rollNo: " + obj.getRollNo());


// Direct access of rollNo is not possible due to

// System.out.println("CodeBus
    }
}
