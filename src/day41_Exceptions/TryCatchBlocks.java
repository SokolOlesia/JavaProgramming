package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
        } catch (RuntimeException e) {
            //System.out.println("RuntimeException was occurred");
            //e.printStackTrace(); //java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5 at day41_Exceptions.TryCatchBlocks.main(TryCatchBlocks.java:22)
            System.out.println(e.getMessage()); //Index 200 out of bounds for length 5
        }


        System.out.println("Test2 Compiled");

        System.out.println("---------------------");

        System.out.println("Test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0));
        }catch(RuntimeException e) {
            e.printStackTrace(); // full information about this exception
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
