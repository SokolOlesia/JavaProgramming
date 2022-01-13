package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; // 10


        for (int i = 0; i < numbers.length; i++) { // numbers.fori
            if( max < numbers[i]) {
                max = numbers [i];
            }
        }
        System.out.println(max);




    }
}
