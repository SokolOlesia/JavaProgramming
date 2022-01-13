package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif", "Sinem", "Guinay", "Cihad", "David" , "James"};
        String[] earlyBirds = Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(earlyBirds));
        String[] earlyBirds2 = Arrays.copyOfRange(students, 3, 4);
        System.out.println(Arrays.toString(earlyBirds2));
    }
}
