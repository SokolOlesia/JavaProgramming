package day24_CustomMethods_Return;

public class Test {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbb";
        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);


        String name = "Java Programming";
        name = ReturnMethodIntro.reversed(name);
        System.out.println(name);
    }
}
