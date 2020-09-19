package ru.capchik.ikbo_13_19.lesson3;

public class Cat extends Animal {

    public Cat(String name) {
        super(0, name);
    }

    public void murlik() {
        System.out.println("mur mur mur");
    }

    @Override
    public String voice() {
        return "May";
    }

    @Override
    public String toString() {
        return "Cat{"+ super.toString() +"}";
    }
}
