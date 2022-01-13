package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharactersCollections {
    public static void main(String[] args) {
        String str = "aaabcccdeeef";
        //str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>(list);
        unique.removeIf(p -> Collections.frequency(list, p ) > 1);
        System.out.println(unique);
        System.out.println("-------------------");
        String unique2 = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique2 += each;
            }
        }
        System.out.println(unique2);
    }
}
