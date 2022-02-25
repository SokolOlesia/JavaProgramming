package day49_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]); //creating object LinkedHashSet(have a order), remove duplicates and converted back to array

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]


        /*Set<String> set1 = new HashSet<>(Arrays.asList(arr));// removing duplicates

        arr = set1.toArray(new String[0]); //converted to Array with new elements


        System.out.println("set1 = " + set1); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
        System.out.println(Arrays.toString(arr)); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
    */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));
    }

}
