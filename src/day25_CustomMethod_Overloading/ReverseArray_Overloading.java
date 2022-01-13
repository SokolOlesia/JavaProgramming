package day25_CustomMethod_Overloading;

public class ReverseArray_Overloading {

//    1. Create a method that can reverse an integer array

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }

    //    2. Create a method that can reverse a double array
    public static double[] reverse(double[] arr) {
        double[] result = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }

    //    3. Create a method that can reverse a char array
    public static char[] reverse(char[] arr) {
        char[] result = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }

    //    4. Create a method that can reverse a String array
    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }

        return result;
    }

}

/*
Task 6:
    1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */