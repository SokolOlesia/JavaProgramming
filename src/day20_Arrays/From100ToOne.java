package day20_Arrays;

import java.util.Arrays;

public class From100ToOne {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length-i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
