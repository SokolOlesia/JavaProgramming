package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {
        String[] name = {"Gunay Mammadova", "Hulya Keles", "Cihad Sahin", "Iryna Melnyk"};
        for (String each: name) {
            String reversed = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
