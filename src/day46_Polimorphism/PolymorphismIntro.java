package day46_Polimorphism;

import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;

public class PolymorphismIntro {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4)}; //Object is a parent

        Animal animal = new Dog("Max","Hysky",'F',3,"Small","white");
        animal.drink();
        animal.eat();
//        animal.play();
//        animal.bark();



    }
}
