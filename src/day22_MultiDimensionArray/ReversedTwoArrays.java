package day22_MultiDimensionArray;

import java.util.Arrays;

public class ReversedTwoArrays {
    public static void main(String[] args) {
        // index:             0         1
        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        //int[][] array = {{4, 5, 6}, {1, 2, 3}};
        //int[][] array = {{3, 2, 1}, {6, 5, 4}};

        // int[][] array = { {6, 5, 4}, {3, 2, 1}};
        // array.length == 2; (external, index : 0, 1)
        // array[0].length == 3 (inner, index: 0, 1, 2)
        // index:         0   1  2
        int[][] reversed = new int[array.length][array[0].length];

        for (int i = array.length - 1, h = 0; i >= 0; i--, h++) {
//           reverse[0] = array[1]
            //reversed[h] = array[i];

           for (int j = array[i].length - 1, k = 0; j >= 0; j--, k++) {
                reversed[h][k] = array[i][j];
           // reversed [0][0] = array [1][3]
            // reversed [0][1] = array [1][2]
         }
        }
        System.out.println(Arrays.deepToString(reversed));
    }
}

//

/*

// i: 1
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};





2D [][] =


 */