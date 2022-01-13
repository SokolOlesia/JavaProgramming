package day22_MultiDimensionArray;

import java.util.Arrays;

public class Tunc {
    public static void main(String[] args) {
        //index              0  1   2   3          0    1    2   3
        int[][] array2D = {{16, 30, 14, 17}, {59, 51, 512, 315}};
        //                        1                  2

        int max = array2D[0][0];
        int min = array2D[0][0];

        for (int i = 0; i < array2D.length; i++) {

            for (int j = 0; j < array2D[i].length; j++) {


                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                }


                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }

            }

        }
        System.out.println("Arrays: " + Arrays.deepToString(array2D));


        System.out.println("Min is = " + " " + min);
        ;
        System.out.println("Max is = " + " " + max);
    }
}
