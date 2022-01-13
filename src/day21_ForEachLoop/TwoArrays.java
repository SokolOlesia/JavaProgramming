package day21_ForEachLoop;

import java.util.Arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[] line1 = {1,2,3};
        int[] line2 = {4,5};

        int[] threeArrays = new int[line1.length + line2.length];
        int i = 0;

        for (int each : line1) {
            threeArrays[i] = each;
            i++;
        }
        for (int each : line2) {
            threeArrays[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(threeArrays));
    }
}
