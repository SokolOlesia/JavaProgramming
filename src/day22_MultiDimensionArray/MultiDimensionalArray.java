package day22_MultiDimensionArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int[] arr4 = {10, 11, 12};
        int[] arr5 = {13, 14, 15};

        // int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}}};
        System.out.println(arr3D.length);

        System.out.println(Arrays.deepToString(arr3D));

        for (int[][] arr2D : arr3D) {
            for (int[] arr1D : arr2D) {
                for (int array : arr1D) {
                    System.out.print(array + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("---------------");
        System.out.println(Arrays.deepToString(arr3D[1])); //{{10, 11, 12}, {13, 14, 15}}
        System.out.println(Arrays.toString(arr3D[1][1])); // {13, 14, 15}
        System.out.println(arr3D[0][2][2]);// single elements 9
    }
}
