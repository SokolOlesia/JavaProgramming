package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Biewer";
        dog1.size = "Small";
        dog1.age = 1;
        dog1.gender = 'F';
        dog1.name = "Mia";
        dog1.color = "Gold-black-white";

        Dog dog2 = new Dog();
        dog2.setInfo("Lucy", "Husky", 3, 'M', "Small", "Black");

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        Dog[] dogs = {dog1,dog2};
        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));




        maleDogs.removeIf(p -> p.gender == 'F');
        femaleDogs.removeIf(p -> p.gender == 'M');
        System.out.println(maleDogs);
        System.out.println("------------------");
        System.out.println(femaleDogs);

        for (Dog maleDog : maleDogs) {
            System.out.println(maleDog.name + " : " + maleDog.gender);

        }
        for (Dog femaleDog : femaleDogs) {
            System.out.println(femaleDog.name + " : " + femaleDog.gender);

        }
    }
}
