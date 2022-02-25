package day49_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]); //creating object LinkedHashSet(have an exact same order), remove duplicates and converted back to array

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]


        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));// removing duplicates

        arr = set1.toArray(new String[0]); //converted to Array with new elements


        System.out.println("set1 = " + set1); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
        System.out.println(Arrays.toString(arr)); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
    */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("list = " + list);

        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};
        List<String> s = new ArrayList<>(Arrays.asList(array));
        //s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("C", "F","G"));

        System.out.println("-----------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */


        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));

        String str = "eeeeeaaaabbbbccccdddeeee";

        //  eabcd
        //  54434
        String result ="";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")),each);
            result+=each + count;
        }
        System.out.println(result);

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4));
        for(String name : names){
            System.out.println(name);
        }
    }

}
