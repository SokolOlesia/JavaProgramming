package day31_Constructors;

import java.util.ArrayList;

public class Person {
    public String name; // instance variable
    public char gender; // instance variable
    public int age; // instance variable
    public static String schoolName = "Cydeo"; // static variable
    private static int count = 0; // static variable
    public int ID;

    public static ArrayList<Person> personArr = new ArrayList<Person>();

    public static void createPerson(String name, char gender, int age){
        Person personTemp = new Person(name, gender, age);
        personArr.add(personTemp);
    }

    public static Person getPersonById(int id){
        return personArr.get(id);
    }

    public static int getCount() {
        return count;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age + ", school=" + schoolName + ", ID=" + ID +
                '}';
    }

    public Person(String name, char gender, int age) {
        this.name = name/*Daniel*/;
        this.gender = gender; //M
        this.age = age;
        ID = count++;
    }
}
