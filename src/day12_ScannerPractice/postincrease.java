package day12_ScannerPractice;

public class postincrease {
    public static void main(String[] args) {
        int mon = 1;
        String nameOfMonth = "";


        if(mon >= 1 && mon <=12){// valid number of month

         nameOfMonth =  (mon == 1) ? "Jan" : (mon == 2) ? "Feb" : (mon == 3) ? "Mar" : "Apr"; // Tern

        } else {// invalid number of month
            System.out.println("Invalid number");
        }
        System.out.println(nameOfMonth);
        System.out.println("--------------------");

        if(mon >= 1 && mon <=12){

            switch (mon) {

            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
            default: // none of previous 3 cond
                System.out.println("Apr");


    }} else {
            System.out.println("Invalid");
        }




}}
