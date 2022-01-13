package day22_MultiDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below

        String[] words = str.split(", "); //now we have array
        Arrays.sort(words);
        String listOfWords = "";
        String word = words[0];
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() < word.length()){
                //olive                 olive -- false
                //fish                  olive -- true
                //old                   fish  -- true
                //ray                   old   -- false
                word = words[i];
                // word = olive
                // word = fish
                // word = old
                // word = old
                listOfWords = "";//reset listOfWords because we have a word, which smaller

            }
            if (words[i].length() == word.length()){

                listOfWords += words[i] + ", ";
                //olive,
                //
                //fish,
                //old,
                // old, ray

            }

        }

        String[] result = listOfWords.split(", ");
        System.out.println(Arrays.toString(result));

    }
}
