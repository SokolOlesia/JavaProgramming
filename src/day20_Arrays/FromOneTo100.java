package day20_Arrays;

import java.util.Arrays;

public class FromOneTo100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
