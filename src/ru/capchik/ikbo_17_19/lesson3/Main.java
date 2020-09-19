package ru.capchik.ikbo_17_19.lesson3;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Barsik");
        animals[1] = new Dog(45, "Ann");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].voice());
        }

//        System.out.println(animalCat.voice());
//        System.out.println(dog.voice());
    }
}
