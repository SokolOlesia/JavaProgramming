package day04_Variables;

public class SallaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65;
        int weeklyHours = 40;
        int numberOfWeeks = 365/7;
        int salaryWeekly = hourlyRate*weeklyHours;
        int annualSalary = numberOfWeeks*salaryWeekly;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salaryWeekly = $" + salaryWeekly);
        System.out.println("annualSalary = $" + annualSalary);
    }
}
