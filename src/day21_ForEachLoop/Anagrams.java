package day21_ForEachLoop;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "acdb";
        String str2 = "dbca";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(Arrays.equals(chars1, chars2));
    }
}
