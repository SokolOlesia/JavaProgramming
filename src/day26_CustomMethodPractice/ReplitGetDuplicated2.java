package day26_CustomMethodPractice;

import java.util.Scanner;

public class ReplitGetDuplicated2 {

    public static int getDup(String[] r) {
        String result = "";
        for (int j = 0; j < r.length; j++) {
            String str = r[j];//"1"
            int frequency = 0;

            for (int i = 0; i < r.length; i++) {
                if (r[i].equals(str)) {
                    frequency++;
                }
            }
            if (frequency >= 2) {
                result += str + ", ";
            }
        }
        System.out.println(result);
        String[] counts = result.split(", ");
        return counts.length;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String [] strs = new String[in.nextInt()];
//        for(int i=0; i < strs.length; i++) {
//            strs[i] = in.next();
//        }
        String[] strs = { "1", "2", "aa", "1", "aa" };
        System.out.println(getDup(strs));

    }

}
