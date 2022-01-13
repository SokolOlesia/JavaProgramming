package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Muhtar","Ali", "David", "Ahmet", "Jimmy", "Daniel", "Aaron", "Ahmet", "David", "Shay"));
        employees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println(employees);


        System.out.println("-------------------------");
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p -> p.charAt(0) == 'M'); // or startsWIth(M)

        System.out.println(list);
        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
/*
remove all the employees
 */