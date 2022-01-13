package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);// hashcode

        String str = "Java";

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]); // 1

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min = " + nums[0]);
        System.out.println("max = " + nums[nums.length - 1]);


        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] names1 = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names1);
        System.out.println(Arrays.equals(names, names1)); //bool

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2));

        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    }
}
