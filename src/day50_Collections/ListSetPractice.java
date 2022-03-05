package day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("set.size() = " + set.size() +" = " +set);

        //Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set); //convert set to List with constructor
        System.out.println("list = " + list);

        //List <String> names = null;
        //System.out.println("names.size() = " + names.size()); //NullPointerException

        System.out.println("--------------");
        //pop() only Stack LIFO - Last In --> First out
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B', 'C','D'));
        System.out.println(chars);//[A, B, C, D]
        ((Stack<Character>) chars).pop();
        System.out.println(chars);//[A, B, C]


        System.out.println("--------------");
        //poll() only for Queue FIFO - First in --> First out
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Max"));
        System.out.println(names);//[James, Jimmy, Kathy, Max]
        ((LinkedList<String>) names).poll();
        System.out.println(names);//[Jimmy, Kathy, Max]


    }
}
