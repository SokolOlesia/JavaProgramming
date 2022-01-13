package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] name = {"Gunay Mammadova", "Hulya Keles", "Cihad Sahin", "Iryna Melnyk"};

        for (String each : name) {
            String initials = each.toUpperCase().charAt(0) + "." + each.toUpperCase().charAt(each.indexOf(" ")+1);
            System.out.println("initials  = " + initials );
        }

    }
}
