package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArraysUtility.printEachElement(arr);

        System.out.println("---------------");

        double[] arr2 = {2.5, 5.8, 4.9};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------");
        char[] arr3 = {'A', 'C', 'H'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------");

        String[] arr4 = {"Olesia", "Java", "Cydeo"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------");

    }
}