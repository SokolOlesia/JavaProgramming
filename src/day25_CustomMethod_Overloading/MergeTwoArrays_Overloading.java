package day25_CustomMethod_Overloading;

public class MergeTwoArrays_Overloading {
    //1. create a method that can merge two integer arrays.
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
    }

    // 2. create a method that can merge two double arrays.
    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }

        return result;
    }

    //3. create a method that can merge two char arrays.
    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }

        for (char each : arr2) {
            result[i++] = each;
        }

        return result;
    }

    //4. create a method that can merge two String arrays.
    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }

        return result;
    }
}

/*
Task3:
    1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)

 */