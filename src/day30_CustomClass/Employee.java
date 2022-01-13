package day30_CustomClass;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee - "  + "\n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n"+
                "Age:" + age + "\n"+
                "ID: " + id + "\n"+
                "JobTitle: " + jobTitle + "\n" +
                "Salary: " + salary + "\n" +
                "Is FullTime: " + isFullTime + "\n";
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }

}
