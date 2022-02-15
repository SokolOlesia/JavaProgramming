package day47_Polymorphism;

import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        //Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5); //smaller to bigger

        //Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal;

        System.out.println(animal.getName());
        System.out.println(dog.getName());
        ((Dog) animal).bark();
        dog.bark();
    }
}
