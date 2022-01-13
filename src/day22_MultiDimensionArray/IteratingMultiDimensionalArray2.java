package day22_MultiDimensionArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: index number of 1D array starting from last index to 0
            for (int j = 0; j < arr2D[i].length ; j++) { //j: index number of elements starting from 0 to last index
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < arr2D.length; i++) {// i: index number of 1D array starting from 0 to last index
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: index number of elements starting from last index to 0
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: index number of 1D array starting from last index to 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: index number of elements starting from last index to 0
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
