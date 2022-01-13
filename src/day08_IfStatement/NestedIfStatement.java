package day08_IfStatement;

public class NestedIfStatement {
    public static void main(String[] args) {
        /*
        Syntax of Nested If Statements

        if (Condition) {
            if (Condition){

                Statements

            }
        }
         */

        int score = 1700;

        if (score >= 0 && score <= 100) { //if score is valid
            if (score >= 60) {
                System.out.println("Passed!");
            } else { // score <60
                System.out.println("Failed!");
            }
        } else { //if the score isn't valid
            System.out.println("Invalid score!");
        }

    }
}
