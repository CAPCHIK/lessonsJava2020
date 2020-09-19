package ru.capchik.ikbo_13_19.lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Murzik"));
        animals.add(new Dog(10, "Sharik"));
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).voice());
        }
    }
}
