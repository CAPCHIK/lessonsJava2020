package ru.capchik.ikbo_17_19.lesson3;

public class Cat extends Animal {
    public Cat(String name) {
        super(0, name);

    }
    @Override
    public String voice() {
        return "May";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()     +"}";
    }

    public void murluk() {
        System.out.println("mur mur mur");
    }
}
