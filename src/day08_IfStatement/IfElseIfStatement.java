package day08_IfStatement;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int score = 65;
        char grade; // A, B, C, D, F
//
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else if (score >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
        if(score >= 90) {
            System.out.println('A');
        } else if ( score >=80){
            System.out.println('B');
        } else {
            System.out.println("X");
        }

        if(score >= 90) {
            grade = 'A';

        } else if ( score >=80){
            grade = 'B';
        } else {
            grade = 'C';
        }

        System.out.println("grade = " + grade);

        char lastGrade = 'A';

        String grades = lastGrade + " " + grade;

        System.out.println("grades = " + grades);

    }
}
