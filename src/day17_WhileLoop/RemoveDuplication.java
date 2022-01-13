package day17_WhileLoop;

public class RemoveDuplication {
    public static void main(String[] args) {
        String str = "AAABBBCCC";

        String result = ""; //ABC

        for (int i = 0; i < str.length() - 1; i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch)) {
                continue;
            } else {
                result += ch;
            }
        }
        System.out.println(result);

    }
}
