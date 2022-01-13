package day08_IfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {
        int day = 7;
        String dayName;
        /*if (day == 1) {
           dayName = "Mon";
        } else if (day == 2) {
           // System.out.println("Tue");
            dayName = "Tue";
        } else if (day == 3) {
            //System.out.println("Wed");
            dayName = "Wed";
        } else if (day == 4) {
            //System.out.println("Thu");
            dayName = "Thu";
        } else if (day == 5) {
            //System.out.println("Fri");
            dayName = "Fri";
        } else if (day == 6) {
            //System.out.println("Sat");
            dayName = "Sat";
        } else {
            //System.out.println("Sun");
            dayName = "Sun";
        }
        System.out.println(dayName);*/
        System.out.println("--------------------");
        dayName = (day == 1) ? "Monday" : ((day == 2) ? "Tuesday" : ((day == 3) ? "Wednesday" : ((day == 4) ? "Thursday" : ((day == 5) ? "Friday" : ((day == 6) ? "Saturday" : ((day == 7) ? "Sunday" : "Wrong day "))))));
        System.out.println(dayName);
    }
}
