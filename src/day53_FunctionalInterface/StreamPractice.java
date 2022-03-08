package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9));
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};
        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        arr2 = Arrays.stream(arr2).skip(5).toArray();
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list3 = list3.stream().skip(2).limit(7).collect(Collectors.toList());
        System.out.println(list3);

        System.out.println("----------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list4 = list4.stream().map(p -> p * 10).collect(Collectors.toList());
        System.out.println(list4);

        System.out.println("----------------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());

        System.out.println(days);

        System.out.println("----------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evens = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());

        System.out.println(evens);

        System.out.println("----------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

        long countJava = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();

        System.out.println(countJava);

        System.out.println("----------------------------");

        names.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));
        System.out.println("----------------------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean r1 = list6.stream().allMatch(p -> p % 2 == 0);
        System.out.println(r1);

        System.out.println("----------------------------");
        boolean r2 = list6.stream().anyMatch(p -> p < 28);
        System.out.println(r2);

        System.out.println("----------------------------");
        boolean r3 = list6.stream().noneMatch(p -> p % 3 == 0);
        System.out.println(r3);
    }
}
