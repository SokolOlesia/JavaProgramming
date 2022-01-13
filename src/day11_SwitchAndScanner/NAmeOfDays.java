package day11_SwitchAndScanner;

public class NAmeOfDays {
    public static void main(String[] args) {
        int year = 2010;
        int num = 2;
        String result = "";
        if (num >= 1 && num <= 12) {

            switch (num) {

                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    /*if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }*/
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    //System.out.println("30 days");
                    result = "30 days";
                    break;

                default:
                    //System.out.println("31 days");
                    result = "31 days";
            }
        } else {
            //System.out.println("Invalid number");
            result = "Invalid number";
        }
        System.out.println(result);
    }
}

