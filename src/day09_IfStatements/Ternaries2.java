package day09_IfStatements;

public class Ternaries2 {
    public static void main(String[] args) {
        int score = 40;
        char value;
       /* boolean a = ;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && !a; //if score is A, but score is greater than 80
        //boolean c = score >=70 && score <= 79;
        boolean c = !a && !b && score >= 79;
        boolean d = !a && !b && !c && score >= 69;
        boolean e = !a && !b && !c && !d;

        */
        if (score >= 90) {
            //System.out.println("Exellent"); //A
            value = 'A';
        } else if (score >= 80) {
            //System.out.println("Great");//B
            value = 'B';
        } else if (score >= 70) {
            //System.out.println("Good");//C
            value = 'C';
        } else if (score >= 60) {
            //System.out.println("Passed");
            value = 'D';
        } else {
            //System.out.println("Failed");
            value = 'F';
        }
        System.out.println(value);

        char grade = score >= 90 ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println(grade);
    }
}
