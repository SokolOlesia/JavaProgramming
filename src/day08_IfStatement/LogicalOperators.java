package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible + ".");

        boolean result = true;

        System.out.println("result = " + result);

        boolean result1 = !result;

        System.out.println("result1 = " + result1);
    }
}
