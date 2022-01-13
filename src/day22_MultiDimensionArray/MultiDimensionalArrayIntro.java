package day22_MultiDimensionArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        // String[][] groups = new String[3][3];
        String[][] groups = new String[3][];
        String[] group1 = {"Jhon", "Shay", "Aygyn"};
        String[] group2 = {"Jhon", "Shay", "Aygyn"};
        String[] group3 = {"Jhon", "Shay", "Aygyn"};

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("-----------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
        */
        //index:          0  1  2    0  1  2  3    0  1  2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //     index:        0           1            2

        int[] secondArray = arr2D[1];
        System.out.println(Arrays.toString(secondArray));

        int[] lastArray = arr2D[arr2D.length-1];
        //System.out.println(Arrays.toString(lastArray));

        int eleven = arr2D[arr2D.length-1][lastArray.length-2];
        System.out.println(eleven);
    }
}
