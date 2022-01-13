package day26_CustomMethodPractice;

import java.util.Scanner;

public class UniqueReplits {

    public static void main(String[] args) {
        String str = "aabccdeef"; // 2a1b2c1d2e1f
        String result = "";

        char ch = 'a';
        int count = 0; // represent the frequency of the ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(ch == each){
                count++;


            }
            result += count + ch;
        }
        System.out.println(result);


    }
}
