package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        try {
            System.out.println(9 / 0);

            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception was occurred");
        }
        System.out.println("Test compiled");


        System.out.println("------------------------");

        int[] numbers = {1,2,3,4,5};

        try{
            System.out.println(numbers[200]);
            System.out.println("Try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was occurred");
        }


        System.out.println("Test2 Compiled");
    }
}
