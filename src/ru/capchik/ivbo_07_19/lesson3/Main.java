package ru.capchik.ivbo_07_19.lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat(5, "Vasya");
//        Animal dog = new Dog(3, "Jack");
//        System.out.println(cat.voice());
//        System.out.println(dog.voice());

        ArrayList<Movable> objects = new ArrayList<>();
        objects.add(new MovablePoint(5, 6));
        for (Movable movable : objects) {
            movable.move(5, -56);
            System.out.println(movable);
        }

    }
}
