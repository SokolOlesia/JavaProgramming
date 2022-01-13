package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Olesia", "Mia"};
        String[] group2 = {"Maria", "Suat", "Valeriy", "Aseynur"};

        String[] students = new String[group1.length + group2.length];
        int i = 0;
        for (String each : group1) {
            students[i++] = each;

        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));
        System.out.println("--------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];
        int j = 0;

        for (char each : ch1) {
            chars[j++] = each;
            //chars[j] = each;
            //j++
        }
        for (char each : ch2) {
            chars[j++] = each;
        }
        System.out.println(Arrays.toString(chars));
        System.out.println("--------------");

        int[] lines1 = {1, 2, 3};
        int[] lines2 = {4, 5};

        int[] threeArrays = new int[lines1.length + lines2.length];
        int h = 0;

        for (int each : lines1) {
            threeArrays[h] = each;
            h++;
        }
        for (int each : lines2) {
            threeArrays[h] = each;
            h++;
        }
        System.out.println(Arrays.toString(threeArrays));


    }
}
