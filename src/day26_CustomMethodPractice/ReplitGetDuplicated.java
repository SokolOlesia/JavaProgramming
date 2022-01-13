package day26_CustomMethodPractice;

import java.util.*;

public class ReplitGetDuplicated {

    public static int getDup(String[] r) {
        int count = 0, subcount = 0;

        boolean[][] match = new boolean[r.length][r.length];

        for (int i = 0; i < r.length; i++)
            for (int j = 0; j < r.length; j++)
                match[i][j] = (r[i].equals(r[j]) && i<j);

        for (int k = 0; k < r.length; k++){
            for (int l = 0; l < r.length; l++){
                if (match[k][l] && k<l){
                    subcount++;
                    for (int m = 0; m < r.length; m++){
                        match[l][m] = false;
                    }
                }
            }

            if (subcount > 0) subcount++;
            count += subcount;
            subcount = 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}
