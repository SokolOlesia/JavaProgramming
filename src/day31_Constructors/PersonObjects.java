package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {
//        Person person1 = new Person("Daniel", 'M', 32);
//        Person person2 = new Person("Kseniia", 'F', 28);
//        Person person3 = new Person("Masha", 'F', 28);
//        Person person4 = new Person("Sasha", 'M', 24);
//        Person person5 = new Person("Vasya", 'M', 67);
//
//        person2.age = 30;
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
//        System.out.println(person5);
//
//        System.out.println(Person.getCount());

        Person.createPerson("Daniel", 'M', 32);
        Person.createPerson("Kseniia", 'F', 28);
        Person.createPerson("Masha", 'F', 28);
        Person.createPerson("Sasha", 'M', 24);

        System.out.println(Person.getPersonById(3));
    }
}
