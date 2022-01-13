package day09_IfStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 4;

        //print the name of the day
        switch (num) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Can not find name of the day!");
                break;

        }
    }







    /* switch(expression){
            case constant1:
                statements;
                break;
            case constant1:
                statements;
                break;
            default:
                statements;
                break;
}
     */
}
